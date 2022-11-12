package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class AppUiScreenDetails {
	@Id
	@Column(name="screen_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int screenId;
	
	@Column(name="screen_name")
	private String screenName;
	
	@Column(name="screen_number")
	private String screenNumber;
	
	@Column(name="screen_display_name")
	private String screenDisplayName;
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getScreenNumber() {
		return screenNumber;
	}
	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}
	public String getScreenDisplayName() {
		return screenDisplayName;
	}
	public void setScreenDisplayName(String screenDisplayName) {
		this.screenDisplayName = screenDisplayName;
	}
	
	@Override
	public String toString() {
		return "AppUiScreenDetails [screenId=" + screenId + ", screenName=" + screenName + ", screenNumber="
				+ screenNumber + ", screenDisplayName=" + screenDisplayName + "]";
	}
	
	
	
}
