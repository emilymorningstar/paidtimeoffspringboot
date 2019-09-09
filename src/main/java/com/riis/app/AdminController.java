package com.riis.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@PutMapping(value="/{action}") //should be put. //make sure to pass an int and not a json object, no names and no {}
	//action should be approve or deny
	public @ResponseBody RequestEntity changeStatusRequest(@RequestBody int Id, @PathVariable ("action") String action) {
		System.out.println(action);
		int status = 2;
		if(action.equalsIgnoreCase("deny"))
		{
			status=3;
		}
		if(action.equalsIgnoreCase("approve")) {
			status=1;
		}
		return requestService.changeStatusRequest(Id, status);
		
}}
