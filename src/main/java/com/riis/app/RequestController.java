package com.riis.app;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
 //is this supposed to be page name or table name?
public class RequestController {
	@Autowired
	RequestService requestService;
	
	@GetMapping
	@RequestMapping(value = "/Requests/{id}")
	public List<RequestEntity> getRequests(@PathVariable("id") String id) {
		return requestService.getRequests(Integer.parseInt(id));
	}
	@PostMapping
	@RequestMapping("Requests")
	public NewRequestModel createRequest(@RequestBody NewRequestModel requestDetails) {
		NewRequestModel returnValue = new NewRequestModel();
		NewRequestModel createdRequest = requestService.createRequest(requestDetails);
		BeanUtils.copyProperties(createdRequest, returnValue);
		return returnValue;
	}
	@PutMapping
	public String changeRequest() {
		return "change request was called";
	}
}
