package com.riis.app;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService implements UserDetailsService{
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
	public UserDetails loadUserByUsername(String arg0)throws UsernameNotFoundException {//maybe add a user not found like in the demo
		UserEntity userEntity = userRepository.findByEmail(arg0);
		if(userEntity==null) {
			throw new UsernameNotFoundException("username "+arg0+" not found");
		}
		//imported from spring framework security core
		return new User(userEntity.getEmail(), userEntity.getPassword(), new ArrayList<>());
		
	}
	public UserEntity getUser(String email) {
		UserEntity userEntity = userRepository.findByEmail(email);
		if(userEntity==null) {
			throw new UsernameNotFoundException("username "+email+" not found");
		}
		return userEntity;
		
	}

}
