package com.example.demo.model.submodel;

import java.util.List;

import com.example.demo.model.Country;

public class AppUiScreenFieldsCustom {

		//private int recordNo;
		
		//private String screenNo;
		
		private String fieldsToDisplay;
		
		private String fieldsOrderToDisplay;
		
		private String uiType;
		
		private String validator;
		
		private String fieldGroup;
		
		private String submitModel;
		
		private List<Object> select_option;
		//private List<String> select_option_list;
		
		private String default_option;

		
//		public int getRecordNo() {
//			return recordNo;
//		}
//
//		public void setRecordNo(int recordNo) {
//			this.recordNo = recordNo;
//		}

//		public String getScreenNo() {
//			return screenNo;
//		}
//
//		public void setScreenNo(String screenNo) {
//			this.screenNo = screenNo;
//		}

		public String getSubmitModel() {
			return submitModel;
		}

		public void setSubmitModel(String submitModel) {
			this.submitModel = submitModel;
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

		public List getSelect_option() {
			return select_option;
		}

		public void setSelect_option(List select_option) {
			this.select_option = select_option;
		}

		public String getDefault_option() {
			return default_option;
		}

		public void setDefault_option(String default_option) {
			this.default_option = default_option;
		}

		@Override
		public String toString() {
			return "AppUiScreenFieldsCustom [fieldsToDisplay=" + fieldsToDisplay + ", fieldsOrderToDisplay="
					+ fieldsOrderToDisplay + ", uiType=" + uiType + ", validator=" + validator + ", fieldGroup="
					+ fieldGroup + ", submitModel=" + submitModel + ", select_option=" + select_option
					+ ", default_option=" + default_option + "]";
		}

		
		
		
		
}
