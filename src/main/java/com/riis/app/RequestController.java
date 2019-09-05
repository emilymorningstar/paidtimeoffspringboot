package com.riis.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Requests") //is this supposed to be page name or table name?
public class RequestController {
	@GetMapping
	public String getRequests() {
		return "get requests was called";
	}
	@PostMapping
	public String createRequest(@RequestBody NewRequestModel requestDetails) {
		return "create request was called";
	}
	@PutMapping
	public String changeRequest() {
		return "change request was called";
	}
}
