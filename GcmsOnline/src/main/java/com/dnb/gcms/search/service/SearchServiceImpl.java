package com.dnb.gcms.search.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dnb.gcms.common.domain.CompanyDirectPlus;
import com.dnb.gcms.common.domain.DunsSearchInfo;
import com.dnb.gcms.common.domain.SearchCandidates;
import com.dnb.gcms.util.FormatterTool;
@Service
public class SearchServiceImpl{
	
	private final RestTemplate restTemplate;
	private static final String DIRECT_PLUS_TOKEN_END_POINT = "https://ip.static.plus.dnb.com/v2/token";
	private static final String DIRECT_PLUS_CRITERIA_END_POINT = "https://ip.static.plus.dnb.com/v1/search/criteria";
	
	/**
	 * Constructor for building Rest Template 
	 * @param restTemplateBuilder
	 */
	public SearchServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
	
	/**
	 * REST call to direct+ API
	 * @param duns
	 * @return
	 */
	public List<DunsSearchInfo> getSearchResult(String duns) throws Exception{
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    
		String encodedString = "Basic " + Base64.getEncoder().encodeToString(("mxAikcM3zYN1VdxgyKvIbbIS9gt5fCVA" + ":" + "p3Mux4rZKnKqCHs5").getBytes());
		headers.add(HttpHeaders.AUTHORIZATION,encodedString);
		
		String bodyMessage = "{\"grant_type\" : \"client_credentials\"}";
		HttpEntity<String> entity = new HttpEntity<String>(bodyMessage, headers);
		
		
		ResponseEntity<String> result  = this.restTemplate.exchange(DIRECT_PLUS_TOKEN_END_POINT, HttpMethod.POST,entity, String.class);
		DunsSearchInfo dunsSearchInfo;
		
		JSONObject tokenJson = new JSONObject(result.getBody());
		System.out.println(tokenJson.getString("access_token"));
		HttpHeaders headersSearchRequest = new HttpHeaders();
		headersSearchRequest.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headersSearchRequest.setContentType(MediaType.APPLICATION_JSON);
		headersSearchRequest.add(HttpHeaders.AUTHORIZATION, "Bearer "+tokenJson.getString("access_token"));
		String bodySearchMessage;
		if(StringUtils.isNumeric(duns)){
			bodySearchMessage = "{\"duns\":\""+ duns +"\"}"; 	
		}else{
			bodySearchMessage = "{\"searchTerm\":\""+ duns +"\"}";
		}
		
		
		HttpEntity<String> entitySearch = new HttpEntity<String>(bodySearchMessage, headersSearchRequest);
		
		ResponseEntity<CompanyDirectPlus> searchResponseJson =  this.restTemplate.exchange(DIRECT_PLUS_CRITERIA_END_POINT, HttpMethod.POST,entitySearch, CompanyDirectPlus.class);
		CompanyDirectPlus companyDirect = searchResponseJson.getBody();
		FormatterTool formatterTool = new FormatterTool();
		List<DunsSearchInfo> dunsSearchInfoList = new ArrayList<DunsSearchInfo>(companyDirect.getSearchCandidates().size());
		if(companyDirect.getSearchCandidates()!=null && companyDirect.getSearchCandidates().size() > 0){
			for (SearchCandidates searchCandidates : companyDirect.getSearchCandidates()) {
				dunsSearchInfo = new DunsSearchInfo();
				dunsSearchInfo.setDunsInput("");
				dunsSearchInfo.setDuns(searchCandidates.getOrganization().getDuns());
				dunsSearchInfo.setCompanyName(searchCandidates.getOrganization().getPrimaryName());
				Double revenue = 0d;
				if(searchCandidates.getOrganization().getFinancials().size() > 0){
					revenue = searchCandidates.getOrganization().getFinancials().get(0).getYearlyRevenue().get(0).getValue();
				}
				dunsSearchInfo.setRevenue(formatterTool.formatDecimalToString(revenue));
				dunsSearchInfo.setTier((short) 1);
				dunsSearchInfo.setUpdatedDate(new Date());
				dunsSearchInfo.setAssignedDate(new Date());
				dunsSearchInfoList.add(dunsSearchInfo);
			}
		}
		
	    return dunsSearchInfoList;
	}
}
