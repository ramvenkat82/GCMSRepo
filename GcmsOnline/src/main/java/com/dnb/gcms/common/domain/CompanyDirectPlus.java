package com.dnb.gcms.common.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CompanyDirectPlus {

	@JsonProperty("searchCandidates")
	private List<SearchCandidates> searchCandidates;
	
/*	private AddressCountry addressCountry;
	private AddressLocality addressLocality;
	private AddressRegion addressRegion;
	private BusinessEntityType businessEntityType;
	private CorporateLinkage corporateLinkage;
	private DunsControlStatus dunsControlStatus;
	private FamilytreeRolesPlayed familytreeRolesPlayed;
	private Financial financial;
	private Input input;*/
	private InquiryDetail inquiryDetail;
/*	private NumberOfEmployee numberOfEmployee;
	private Organization organization;
	private PrimaryAddress primaryAddress;
	private PrimaryIndustryCode primaryIndustryCode;
	private SearchCandidate searchCandidate;
	private StreetAddress streetAddress;
	private Telephone telephone;*/
	private TransactionDetail transactionDetail;
//	private YearlyRevenue yearlyRevenue;
	private int candidatesMatchedQuantity;
	private int candidatesReturnedQuantity;
	
	public List<SearchCandidates> getSearchCandidates() {
		return searchCandidates;
	}
	public void setSearchCandidates(List<SearchCandidates> searchCandidates) {
		this.searchCandidates = searchCandidates;
	}
	public InquiryDetail getInquiryDetail() {
		return inquiryDetail;
	}
	public void setInquiryDetail(InquiryDetail inquiryDetail) {
		this.inquiryDetail = inquiryDetail;
	}
	public TransactionDetail getTransactionDetail() {
		return transactionDetail;
	}
	public void setTransactionDetail(TransactionDetail transactionDetail) {
		this.transactionDetail = transactionDetail;
	}
	public int getCandidatesMatchedQuantity() {
		return candidatesMatchedQuantity;
	}
	public void setCandidatesMatchedQuantity(int candidatesMatchedQuantity) {
		this.candidatesMatchedQuantity = candidatesMatchedQuantity;
	}
	public int getCandidatesReturnedQuantity() {
		return candidatesReturnedQuantity;
	}
	public void setCandidatesReturnedQuantity(int candidatesReturnedQuantity) {
		this.candidatesReturnedQuantity = candidatesReturnedQuantity;
	}
	
	
	
}
