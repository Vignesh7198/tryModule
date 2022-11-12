package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Country;

public interface CountryListRepo extends JpaRepository<Country, Integer>{
	
	@Query(nativeQuery = true, value = "select * from test_schema.country")
	public List<Country> fetchCountry(@Param("country_list") String country);
}
