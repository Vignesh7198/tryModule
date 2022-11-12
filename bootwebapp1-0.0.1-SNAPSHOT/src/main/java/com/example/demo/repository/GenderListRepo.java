package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Gender;

public interface GenderListRepo extends JpaRepository<Gender, Integer>{
	@Query(nativeQuery = true, value = "select * from test_schema.gender")
	public List<Gender> fetchCountry(@Param("gender") String gender);
}
