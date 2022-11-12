package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.CommonData;

public interface CommonTableDataRepo extends JpaRepository<CommonData, Integer>{
	@Query(nativeQuery = true, value = "SELECT * FROM test_schema.common_table where data_category=:country_list")
	public List<CommonData> fetchData(@Param("country_list") String country_list);
}
