package com.riis.app;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
	return rs;//DONE get and return multiple rows
	
}
public  List<AdminRequest>  getAllRequests() {
	List<Object> rs = requestRepository.findRequests();//will return multiplerows
	List<AdminRequest> ar = new ArrayList<>();
	for (Object object : rs) {
		System.out.println(Arrays.deepToString((Object[]) object));
		
		AdminRequest a = new AdminRequest();
		a.setFirstname((String) ((Object[]) object)[0]);
		a.setLastname((String) ((Object[]) object)[1]);
		a.setEmail((String) ((Object[]) object)[2]);
		a.setStartDate(((Object[]) object)[3]);
		a.setEndDate(((Object[]) object)[4]);
		a.setId(((Object[]) object)[5]);
		a.setStatus(((Object[]) object)[6]);
		ar.add(a);
	}
	System.out.flush();
	return ar;
}

public RequestEntity changeStatusRequest(int Id, int status) {
	RequestEntity storedRequestDetails = requestRepository.findById(Id);
	storedRequestDetails.setStatus(status);
	requestRepository.save(storedRequestDetails);
//DONE? update the request
	return storedRequestDetails;

	
}
}
