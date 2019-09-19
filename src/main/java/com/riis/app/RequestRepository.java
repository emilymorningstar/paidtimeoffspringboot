package com.riis.app;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RequestRepository extends CrudRepository<RequestEntity, Integer> {
	//RequestEntity findByEmployeeId(int employeeId);
	//returns all requests from an employee
	List<RequestEntity> findByEmployeeId(int employeeId);
	@Query(value="SELECT Firstname, Lastname, email, StartDate, EndDate, Requests.Id, Status from Requests left join  Employees on Requests.EmployeeID=Employees.Id", nativeQuery = true)
	//^^  the sql request that needs to be executed to get the required fields.
	List<Object>  findRequests();
	
	RequestEntity findById(int Id);
	
	
}
