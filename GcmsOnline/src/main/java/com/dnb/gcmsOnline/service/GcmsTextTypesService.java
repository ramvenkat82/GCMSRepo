package com.dnb.gcmsOnline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.dnb.gcmsOnline.dao.GcmsTextTypesDAO;
import com.dnb.model.GcmsTextTypes;
@Service
public class GcmsTextTypesService {
	
	@Autowired
	private GcmsTextTypesDAO gcmsTextTypesDAO;
	
	public List<GcmsTextTypes> getAllGcmsTextTypes(){
		
		return gcmsTextTypesDAO.getAllGcmsTextTypes();
	}
	
	public GcmsTextTypes getAllGcmsTextTypesHardcoded(){
		
		return gcmsTextTypesDAO.getAllGcmsTextTypesHardcoded();
	}
}
