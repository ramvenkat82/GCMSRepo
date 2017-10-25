package com.dnb.gcmsOnline.service;

import java.io.BufferedReader;
import java.io.Reader;
import java.sql.Clob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.gcmsOnline.Model.CoTextWrapper;
import com.dnb.gcmsOnline.dao.GcmsCoTextDAO;
import com.dnb.model.GcmsCoText;

@Service
public class GcmsCoTextService {
@Autowired
private GcmsCoTextDAO gcmsCoTextDAO;


public List<GcmsCoText> getAllGcmsCoText(){
	
	return gcmsCoTextDAO.getAllGcmsCoText();
}

public CoTextWrapper getGcmsCoTextById(Long duns) {
	List<GcmsCoText> gcmsCoTextList = gcmsCoTextDAO.getGcmsCoTextById(duns);
	CoTextWrapper coTextwrapper = new CoTextWrapper();
	for(GcmsCoText gcmsCoText:gcmsCoTextList){
		coTextwrapper.setGcmsCompanyId(gcmsCoText.getGcmsCompanyId());
		coTextwrapper.setGcmsFileName(gcmsCoText.getGcmsFileName());
		coTextwrapper.setGcmsStringData(clobToString(gcmsCoText.getGcmsTextData()));
		break;
	}
	return coTextwrapper;
}

public String clobToString(Clob input){
	 StringBuilder sb = new StringBuilder();
	    try {
	        Reader reader = input.getCharacterStream();
	        BufferedReader br = new BufferedReader(reader);
	        String line;
	        while(null != (line = br.readLine())) {
	            sb.append(line);
	        }
	        br.close();
	    } catch(Exception e){
	    	System.out.println(e.getMessage());
	    }
	    return sb.toString();
}
}
