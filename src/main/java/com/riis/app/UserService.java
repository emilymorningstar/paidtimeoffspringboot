package com.riis.app;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {
	@Autowired
		UserRepository userRepository;
	@PostMapping
	public UserDetailsRequestModel createUser(UserDetailsRequestModel details) {
		
		UserEntity userEntity = new UserEntity(); 
		BeanUtils.copyProperties(details, userEntity);
		userEntity.setRoleID(2);
		UserEntity storedRequestDetails = userRepository.save(userEntity);
		UserDetailsRequestModel returnValue=new UserDetailsRequestModel();
		BeanUtils.copyProperties(storedRequestDetails, returnValue);
		return returnValue;
	}

}
