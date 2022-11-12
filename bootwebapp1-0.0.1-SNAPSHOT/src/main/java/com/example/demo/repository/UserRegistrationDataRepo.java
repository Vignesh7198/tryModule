package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;
import com.example.demo.model.UserRegistrationData;
import org.springframework.data.jpa.repository.Query;

public interface UserRegistrationDataRepo extends JpaRepository<UserRegistrationData, Integer>{
	
	@Query(nativeQuery = true, value = "select * from user_registration_data where password=:password and user_name=:username")
	public UserRegistrationData findByUserNameAndPassword(@Param("username") String username, @Param("password") String password);
	
	@Query(nativeQuery = true, value = "select * from user_registration_data where user_name=:username")
	public UserRegistrationData getUserByUserName(@Param("username") String username);
	
}
