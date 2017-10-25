package com.dnb.gcmsOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.gcmsOnline.Model.CoTextWrapper;
import com.dnb.gcmsOnline.dao.GcmsTextTypesDAO;
import com.dnb.gcmsOnline.service.GcmsCoTextService;
import com.dnb.gcmsOnline.service.GcmsTextTypesService;
import com.dnb.model.GcmsTextTypes;

@RestController
public class GcmsTextTypesController {
	@Autowired
	private GcmsTextTypesService gcmsTextTypesService;
	@Autowired
	private GcmsTextTypesDAO gcmsdao;
	@Autowired
	private GcmsCoTextService gcmsCoText;
	


	@GetMapping("alltypes")
	public ResponseEntity<List<GcmsTextTypes>> getAllTypes() {
		List<GcmsTextTypes> list = gcmsTextTypesService.getAllGcmsTextTypes();
		return new ResponseEntity<List<GcmsTextTypes>>(list, HttpStatus.OK);
	}
	
	@GetMapping("test1")
	public ResponseEntity<GcmsTextTypes> test() {
		GcmsTextTypes list = gcmsdao.getAllGcmsTextTypesHardcoded();
		return new ResponseEntity<GcmsTextTypes>(list, HttpStatus.OK);
	}
	
	@GetMapping("dunsSearch/{duns}")
	public ResponseEntity<CoTextWrapper> getGcmsCoTextById(@PathVariable String duns) {
		CoTextWrapper coText = gcmsCoText.getGcmsCoTextById(Long.parseLong(duns));

		return new ResponseEntity<CoTextWrapper>(coText, HttpStatus.OK);
	}
	
	
	
}
