package com.riis.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;


@Repository
public interface RequestRepository extends CrudRepository<RequestEntity, Integer> {
	RequestEntity findAllByEmployeeId(int employeeId);

	
}
