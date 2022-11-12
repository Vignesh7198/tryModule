package com.example.demo.model.submodel;

import java.util.List;

public class UserRegistrationDataDTO {

	//private int userId;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String gender;
	
	private String phoneNumber;
	
	private String emailId;
	
	private String address;
	
	private String nationality;
	
	private String knownLanguage;
	
	private String userName;
	
	private String password;

//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}




	public String getKnownLanguage() {
		return knownLanguage;
	}

	public void setKnownLanguage(String knownLanguage) {
		this.knownLanguage = knownLanguage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistrationDataDTO [firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId
				+ ", address=" + address + ", nationality=" + nationality + ", knownLanguage=" + knownLanguage
				+ ", userName=" + userName + ", password=" + password + "]";
	}


	
	

}
