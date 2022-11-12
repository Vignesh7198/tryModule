package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.AppUiScreenDetails;
import com.example.demo.model.UserDetails;


public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer>
{

	@Query(nativeQuery = true, value = "select * from user_details where password=:password and user_name=:username")
	public UserDetails findByUsernandPassword(@Param("username") String username, @Param("password") String password);
	
	
	
	//public String displayPage(@Param("screen_number") String screen_number);

	//public List<UserDetails> findByUserName(String userName); 
	//List<userDetails> existsByUserDetails(UserDetails user);
	//UserDetails existByUserName(String userName);

}
