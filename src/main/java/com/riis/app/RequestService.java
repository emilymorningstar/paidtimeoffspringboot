package com.riis.app;

import java.sql.ResultSet;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RequestService {
@Autowired
RequestRepository requestRepository;

public NewRequestModel createRequest(NewRequestModel request) {
	RequestEntity requestEntity = new RequestEntity(); 
	BeanUtils.copyProperties(request, requestEntity);
	requestEntity.setEmployeeId(request.getEmployeeId());//Done get the id from employee 
	RequestEntity storedRequestDetails = requestRepository.save(requestEntity);
	NewRequestModel returnValue=new NewRequestModel();
	BeanUtils.copyProperties(storedRequestDetails, returnValue);
	return returnValue;
}
public RequestEntity getRequests(int employeeId) {
	RequestEntity rs=requestRepository.findAllByEmployeeId(employeeId);
	
	return rs;//TODO properly get and return multiple rows
	
}

}
