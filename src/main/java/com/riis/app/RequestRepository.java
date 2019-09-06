package com.riis.app;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RequestRepository extends CrudRepository<RequestEntity, Integer> {
	//RequestEntity findByEmployeeId(int employeeId);
	//returns all requests from an employee
	List<RequestEntity> findByEmployeeId(int employeeId);
}
