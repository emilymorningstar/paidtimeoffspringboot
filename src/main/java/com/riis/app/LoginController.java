package com.riis.app;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(exposedHeaders="UserID, Role, Authorization")
@RestController
@RequestMapping("login")
public class LoginController {

	@PostMapping
	public void doLogin() {
	
	}
}
