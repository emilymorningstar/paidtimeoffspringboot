package com.riis.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="Employees")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//^^needed to use the databases key generation instead of trying to overwrite it 
	@Column(nullable = false)
	private int Id; // in the database
	@Column(nullable = false)
	private String Firstname;
	public int getId() {
		return Id;
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoleID() {
		return RoleID;
	}
	public void setRoleID(int roleID) {
		RoleID = roleID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Column(nullable = false)
	private String Lastname;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private int RoleID=2;
	@Column(nullable = false)
	private String Password;
}
