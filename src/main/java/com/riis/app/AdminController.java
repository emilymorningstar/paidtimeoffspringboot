package com.riis.app;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin()
@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	RequestService requestService;
	
	@GetMapping

	public List<AdminRequest> getAllRequests() {
		return requestService.getAllRequests();
	}
	@PostMapping//should be put. //make sure to pass an int and not a json object, no names and no {}
	//action should be approve or deny
	public @ResponseBody RequestEntity changeStatusRequest(@RequestBody AdminApproveModel adminaction ) {
		System.out.println("changing request status");
		System.out.println(adminaction.getAction());
		System.out.flush();
		System.out.println(adminaction.getId());
		System.out.flush();
		int status = 2;
		if(adminaction.getAction().equalsIgnoreCase("deny"))
		{
			status=3;
		}
		if(adminaction.getAction().equalsIgnoreCase("approve")) {
			status=1;
		}
		return requestService.changeStatusRequest(adminaction.getId(), status);
		
}}
