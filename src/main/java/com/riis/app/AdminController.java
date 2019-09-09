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
	@PutMapping //should be put. //make sure to pass an int and not a json object, no names and no {}
	public @ResponseBody RequestEntity approveRequest(@RequestBody int Id) {
		return requestService.approveRequest(Id);
		
}}
