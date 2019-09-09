package com.riis.app;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

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
public List<RequestEntity> getRequests(int employeeId) {
	List<RequestEntity> rs = requestRepository.findByEmployeeId(employeeId);//will return multiplerows
	RequestEntity r=null;
	return rs;//DONE get and return multiple rows
	
}
public List<RequestEntity> getAllRequests() {
	List<RequestEntity> rs = requestRepository.findAll();//will return multiplerows
	return rs;
}

public RequestEntity approveRequest(int Id) {
	RequestEntity storedRequestDetails = requestRepository.findById(Id);
	storedRequestDetails.setStatus(1);
//DONE? update the request
	return storedRequestDetails;

	
}
}
