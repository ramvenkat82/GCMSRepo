package com.dnb.gcms.common.domain;

import java.util.Date;

public class DunsSearchInfo {
	
	private String companyName;
	private Date updatedDate;
	private short tier;
	private String revenue;
	private String duns;
	private Date assignedDate;
	private String dunsInput;
	
	
	public String getDuns() {
		return duns;
	}
	public void setDuns(String duns) {
		this.duns = duns;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public short getTier() {
		return tier;
	}
	public void setTier(short tier) {
		this.tier = tier;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public Date getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}
	public String getDunsInput() {
		return dunsInput;
	}
	public void setDunsInput(String dunsInput) {
		this.dunsInput = dunsInput;
	}
	
}
