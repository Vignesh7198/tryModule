package com.example.demo.model;

import java.util.List;

import com.example.demo.model.submodel.AppUiScreenFieldsCustom;

public class PageDetails {
	private String screenName;
	
	private List screenUiDetails;

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List getScreenUiDetails() {
		return screenUiDetails;
	}

	public void setScreenUiDetails(List screenUiDetails) {
		this.screenUiDetails = screenUiDetails;
	}

	@Override
	public String toString() {
		return "PageDetails [screenName=" + screenName + ", screenUiDetails=" + screenUiDetails + "]";
	}
	
	//private Object validator;
	
	
	
}
