package com.riis.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
UserEntity findEmployeesByemail(String email);

UserEntity findByEmail(String arg0); 

}
