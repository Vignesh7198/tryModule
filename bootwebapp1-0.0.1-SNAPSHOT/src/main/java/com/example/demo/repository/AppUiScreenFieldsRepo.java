package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.AppUiScreenFields;

public interface AppUiScreenFieldsRepo extends JpaRepository<AppUiScreenFields, Integer> {
	
	@Query(nativeQuery = true, value = "select * from test_schema.app_ui_screen_fields where screen_number=:screen_number order by fields_order_to_display")
	public List<AppUiScreenFields> pageUiFields(@Param("screen_number") String screen_number);
}
 