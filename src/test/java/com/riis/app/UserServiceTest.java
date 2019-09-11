package com.riis.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceTest {
	@InjectMocks
	
	@Mock
	UserService userservice;
	@Mock
	UserRepository userRepository;
	String email="test@user.com";
	@Before
	public void setup() {
	}

	@Test
	public void testgetUser() {
		UserEntity userEntity = userservice.getUser(email);
		assertNotNull(userEntity);
		assertThrows(UsernameNotFoundException.class, ()->{userservice.getUser(null);});
	}

}
