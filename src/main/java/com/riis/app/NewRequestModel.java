package com.riis.app;

import java.sql.Date;

public class NewRequestModel {
	private Date StartDate;
	private Date endDate;
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	
}
