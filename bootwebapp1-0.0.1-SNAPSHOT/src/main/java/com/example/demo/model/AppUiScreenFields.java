package com.example.demo.model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppUiScreenFields {
	@Id
	@Column(name="record_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recordNo;
	
	@Column(name="screen_number")
	private String screenNo;
	
	@Column(name="fields_to_display")
	private String fieldsToDisplay;
	
	@Column(name="fields_order_to_display")
	private String fieldsOrderToDisplay;
	
	@Column(name="ui_type")
	private String uiType;
	
	@Column(name="validator")
	private String validator;
	
	@Column(name="fields_group")
	private String fieldGroup;
	
	@Column(name="select_options")
	private String select_option;
	//private List<String> select_option_list;
	
	@Column(name="default_option")
	private String default_option;
	
	@Column(name="submit_model")
	private String submitModel;

	//public List<String> selectOptionList;
	
	
	public String getSelect_option() {
		return select_option;
	}

	public String getSubmitModel() {
		return submitModel;
	}

	public void setSubmitModel(String submitModel) {
		this.submitModel = submitModel;
	}

	public void setSelect_option(String select_option) {
		this.select_option = select_option;
	}

	public String getDefault_option() {
		return default_option;
	}

	public void setDefault_option(String default_option) {
		this.default_option = default_option;
	}

	public String getFieldsToDisplay() {
		return fieldsToDisplay;
	}

	public void setFieldsToDisplay(String fieldsToDisplay) {
		this.fieldsToDisplay = fieldsToDisplay;
	}

	public String getFieldsOrderToDisplay() {
		return fieldsOrderToDisplay;
	}

	public void setFieldsOrderToDisplay(String fieldsOrderToDisplay) {
		this.fieldsOrderToDisplay = fieldsOrderToDisplay;
	}

	public String getUiType() {
		return uiType;
	}

	public void setUiType(String uiType) {
		this.uiType = uiType;
	}

	public String getValidator() {
		return validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}
	
	

	public String getFieldGroup() {
		return fieldGroup;
	}

	public void setFieldGroup(String fieldGroup) {
		this.fieldGroup = fieldGroup;
	}

	@Override
	public String toString() {
		return "AppUiScreenFields [recordNo=" + recordNo + ", screenNo=" + screenNo + ", fieldsToDisplay="
				+ fieldsToDisplay + ", fieldsOrderToDisplay=" + fieldsOrderToDisplay + ", uiType=" + uiType
				+ ", validator=" + validator + ", fieldGroup=" + fieldGroup + ", select_option=" + select_option
				+ ", default_option=" + default_option + ", submitModel=" + submitModel + "]";
	}

	

}
