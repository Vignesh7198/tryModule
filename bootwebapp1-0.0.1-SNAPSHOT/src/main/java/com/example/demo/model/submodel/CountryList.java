package com.example.demo.model.submodel;

import java.util.List;

import com.example.demo.model.Country;

public class CountryList {
	private List<Country> countryLt;

	public List<Country> getCountryLt() {
		return countryLt;
	}

	public void setCountryLt(List<Country> countryLt) {
		this.countryLt = countryLt;
	}

	@Override
	public String toString() {
		return "CountryList [countryLt=" + countryLt + "]";
	}
	
	
}
