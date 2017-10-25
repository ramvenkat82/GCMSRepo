package com.dnb.gcmsOnline.Model;

import java.math.BigDecimal;
import java.sql.Clob;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.dnb.model.GcmsCoTextId;


public class CoTextWrapper {
	private BigDecimal gcmsDuns;
	private BigDecimal gcmsTextTypeId;
	private BigDecimal gcmsCompanyId;
	private Date gcmsTextLoadDate;
	private String gcmsStringData;
	private String gcmsFileName;
	private BigDecimal gcmsCompanyTier;
	private String modBy;
	private String modComment;
	private Date modDate;
	
	public BigDecimal getGcmsDuns() {
		return gcmsDuns;
	}
	public void setGcmsDuns(BigDecimal gcmsDuns) {
		this.gcmsDuns = gcmsDuns;
	}
	public BigDecimal getGcmsTextTypeId() {
		return gcmsTextTypeId;
	}
	public void setGcmsTextTypeId(BigDecimal gcmsTextTypeId) {
		this.gcmsTextTypeId = gcmsTextTypeId;
	}
	public BigDecimal getGcmsCompanyId() {
		return gcmsCompanyId;
	}
	public void setGcmsCompanyId(BigDecimal gcmsCompanyId) {
		this.gcmsCompanyId = gcmsCompanyId;
	}
	public Date getGcmsTextLoadDate() {
		return gcmsTextLoadDate;
	}
	public void setGcmsTextLoadDate(Date gcmsTextLoadDate) {
		this.gcmsTextLoadDate = gcmsTextLoadDate;
	}
	public String getGcmsStringData() {
		return gcmsStringData;
	}
	public void setGcmsStringData(String gcmsStringData) {
		this.gcmsStringData = gcmsStringData;
	}
	public String getGcmsFileName() {
		return gcmsFileName;
	}
	public void setGcmsFileName(String gcmsFileName) {
		this.gcmsFileName = gcmsFileName;
	}
	public BigDecimal getGcmsCompanyTier() {
		return gcmsCompanyTier;
	}
	public void setGcmsCompanyTier(BigDecimal gcmsCompanyTier) {
		this.gcmsCompanyTier = gcmsCompanyTier;
	}
	public String getModBy() {
		return modBy;
	}
	public void setModBy(String modBy) {
		this.modBy = modBy;
	}
	public String getModComment() {
		return modComment;
	}
	public void setModComment(String modComment) {
		this.modComment = modComment;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

}
