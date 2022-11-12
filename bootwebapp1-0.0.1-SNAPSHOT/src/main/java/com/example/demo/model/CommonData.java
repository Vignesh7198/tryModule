package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "common_table")
public class CommonData {
	@Id
	@Column(name="record_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recordNo;
	
	@Column(name="data_category")
	private String dataCategory;
	
	@Column(name="key")
	private String key;
	
	@Column(name="value")
	private String value;

//	public int getRecordNo() {
//		return recordNo;
//	}
//
//	public void setRecordNo(int recordNo) {
//		this.recordNo = recordNo;
//	}

//	public String getDataCategory() {
//		return dataCategory;
//	}
//
//	public void setDataCategory(String dataCategory) {
//		this.dataCategory = dataCategory;
//	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "key=" + key + ", value="
				+ value + "]";
	}
	
	
}
