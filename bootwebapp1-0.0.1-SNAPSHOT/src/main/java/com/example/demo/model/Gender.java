package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gender {
	@Id
	@Column(name="record_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recordNo;
	
	@Column(name="gender_code")
	private String genderCode;
	
	@Column(name="gender_name")
	private String genderName;

//	public int getRecordNo() {
//		return recordNo;
//	}
//
//	public void setRecordNo(int recordNo) {
//		this.recordNo = recordNo;
//	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	@Override
	public String toString() {
		return "Gender [genderCode=" + genderCode + ", genderName=" + genderName + "]";
	}
	
	
}
