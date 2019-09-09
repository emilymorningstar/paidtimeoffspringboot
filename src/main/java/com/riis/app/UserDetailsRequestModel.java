package com.riis.app;

public class UserDetailsRequestModel {
//private int Id;
	
	//TODO comment out fields that you dont want returned-maybe password
private String Firstname;
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String Firstname) {
	this.Firstname = Firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String Lastname) {
	this.Lastname = Lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getRoleID() {
	return RoleID;
}
public void setRoleID(int RoleID) {
	this.RoleID = RoleID;
}
public String getPassword() {
	return Password;
}
public void setPassword(String Password) {
	this.Password = Password;
}
private String Lastname;
private String email;
private int RoleID=2;
private String Password;
}
