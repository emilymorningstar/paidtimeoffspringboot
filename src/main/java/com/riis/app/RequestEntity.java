package com.riis.app;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Requests")
public class RequestEntity{
	@Column(nullable = false)
private int employeeId;
	@Column(nullable = false)
private Date startDate;
	@Column(nullable = false)
private Date endDate;
	@Column(nullable = false)
private int status=2;
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
//^^needed to use the databases key generation instead of trying to overwrite it 
private int Id;

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}



}
