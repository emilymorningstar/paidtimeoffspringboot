package com.riis.app;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Employees")//is this supposed to be page name or table name?
public class UserController {
	@GetMapping
	public String getUser() {
		return "get user was called";
	}

	@PostMapping
	public String createUser() {
		
		return "create user was called";
	}
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}
