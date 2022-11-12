package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.AppUiScreenDetails;
import com.example.demo.model.submodel.AppUiScreenDetailsTemp;

public interface AppUiScreenDetailsRepo extends JpaRepository<AppUiScreenDetails, String>{
	
	@Query(nativeQuery = true, value = "select screen_display_name from app_ui_screen_details where screen_number=:screen_number")
	public String displayPageDetails(@Param("screen_number") String screen_number);
}


//@Param("screen_number") String screen_number