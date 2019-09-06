package com.riis.app;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Requests") //is this supposed to be page name or table name?
public class RequestController {
	@Autowired
	RequestService requestService;
	
	@GetMapping
	public RequestEntity getRequests(@RequestBody NewRequestModel requestDetails) {
		return requestService.getRequests(requestDetails.getEmployeeId());
	}
	@PostMapping
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
