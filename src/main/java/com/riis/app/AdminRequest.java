package com.riis.app;

import java.sql.Date;

import javax.persistence.Column;

public class AdminRequest {
	private int Id;

	public int getId() {
		return Id;
	}
	public void setId(Object  object) {
		Id =(Integer)object;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(Object object) {
		//will be a problem in the year 10000
		if(object==null) {
			this.startDate="";
		}
		this.startDate =object.toString().substring(0, 10);
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(Object object) {
		//will be a problem in the year 10000
		if(object==null) {
			this.endDate="";
		}
		this.endDate =object.toString().substring(0, 10);;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(Object object) {
		this.status = (Integer)object;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	private String startDate;

	private String endDate;

	private int status = 2;
	private String Firstname;
	private String Lastname;
	private String Email;


}
