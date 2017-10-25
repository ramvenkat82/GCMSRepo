package com.dnb.gcmsOnline.controller;

import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dnb.gcms.common.domain.DunsSearchInfo;
import com.dnb.gcms.search.service.SearchServiceImpl;
import com.dnb.gcmsOnline.service.GcmsTextTypesService;


@Controller
@ComponentScan("com.dnb.gcms.search.service")
public class HomeController {
	
	private static final String HOME_PAGE_NAME="home";
	private static final String SEARCH_RESULTS_PAGE_NAME="search-results";
	private static final String DUNS_SEARCH_INFO_CONSTANT_NAME="dunsSearchInfo";
	
	@Autowired
	private GcmsTextTypesService gcmsTextTypesService;
	
	@Autowired
	private SearchServiceImpl searchServiceImpl;

	
	@RequestMapping("/")
	String home(ModelMap model) {
		DunsSearchInfo dunsSearchInfo = new DunsSearchInfo();
		model.addAttribute(DUNS_SEARCH_INFO_CONSTANT_NAME,dunsSearchInfo);
		return HOME_PAGE_NAME;
		
	}

	
	/**
	 * This method will get the data for the user search
	 * @param dunsSearchInfo. This is the model object which will carry input and output
	 * @param model. This is the Spring Model object which will be used for carrying output to the front end. 
	 * @param redirectAttributes. This is for transferring object from one model to another mode when redirect requires.
	 * @return {@link String}. Returning view name.
	 */
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String dunsSearch(@ModelAttribute DunsSearchInfo dunsSearchInfo, ModelMap model,final RedirectAttributes redirectAttributes){
		 List<DunsSearchInfo> dunsSearchInfoList = null;
		try {
			dunsSearchInfoList = searchServiceImpl.getSearchResult(dunsSearchInfo.getDunsInput());
		}catch(JSONException jsonException){
			return handlingError(model);
		}catch(HttpClientErrorException httpClientErrorException){
			return handlingError(model);
		}catch(ResourceAccessException resourceAccessException){
			return handlingError(model);
		}catch(Exception e){
			return handlingError(model);
		}
		redirectAttributes.addFlashAttribute("dunsSearchInfo", dunsSearchInfoList);
		model.addAttribute("dunsSearchInfoList", dunsSearchInfoList);
		model.addAttribute(DUNS_SEARCH_INFO_CONSTANT_NAME,new DunsSearchInfo());
		return SEARCH_RESULTS_PAGE_NAME;
	}
	
	/**
	 * THis method will handle redirecting with object.
	 * @param mapping1FormObject. It contains actual output object.
	 * @param model. This is the Spring Model object which will be used for carrying output to the front end.
	 * @return {@link String}. Returning view name.
	 */
	@RequestMapping(value = "/searchdata", method = RequestMethod.GET)
	public String searchResult(@ModelAttribute("dunsSearchInfo") final Object mapping1FormObject,final ModelMap model){
		model.addAttribute(DUNS_SEARCH_INFO_CONSTANT_NAME,mapping1FormObject);
		return SEARCH_RESULTS_PAGE_NAME;
	}

	/**
	 * This method will handle exception in case of any exception occurred.
	 * @param model.This is the Spring Model object which will be used for carrying output to the front end. 
	 * @return {@link String}. Returning view name.
	 */
	private String handlingError(ModelMap model){
		DunsSearchInfo dunsSearchInfo = null;
		model.addAttribute(DUNS_SEARCH_INFO_CONSTANT_NAME, dunsSearchInfo);
		model.addAttribute("connection", "Unable to deliver the response. Please try sometime later");
		return SEARCH_RESULTS_PAGE_NAME;
	}
	
	/**
	 * THis method will be removed.
	 */
	private void unwantedCode(){
		System.out.println("Start Time " + new Date());
		long beg = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		long queryExecTime = end - beg;
		System.out.println("queryExecTime " + queryExecTime);
		System.out.println("End Time " + new Date());
	}
}

