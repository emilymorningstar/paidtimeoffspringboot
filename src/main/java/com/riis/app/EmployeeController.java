package com.riis.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Employees")//is this supposed to be page name or table name?

public class EmployeeController {
@Autowired
UserService userservice;
	@GetMapping
	public String getEmployee() {
		return "get user was called";
	}

	@PostMapping
	public UserDetailsRequestModel createEmployee(@RequestBody UserDetailsRequestModel userDetails) {
		
		
		return userservice.createUser(userDetails);
	}
	@PutMapping
	public String updateEmployee() {
		return "update user was called";
	}
	@DeleteMapping
	public String deleteEmployee() {
		return "delete user was called";
	}
}
