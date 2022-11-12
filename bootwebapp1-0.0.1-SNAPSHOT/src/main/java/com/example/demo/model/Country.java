package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	@Column(name="country_record_no")
	private String countryRecordNo;
	
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="country_name")
	private String countryName;

	/*
	 * public String getCountryRecordNo() { return countryRecordNo; }
	 * 
	 * public void setCountryRecordNo(String countryRecordNo) { this.countryRecordNo
	 * = countryRecordNo; }
	 */

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "{countryCode : "+countryCode +","
				+ "countryName : "+countryName+"}";
	}
	
	
	
}
