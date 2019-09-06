package com.riis.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	RequestService requestService;
	
	@GetMapping
	public List<RequestEntity> getAllRequests() {
		return requestService.getAllRequests();
	}
}
