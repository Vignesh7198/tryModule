package com.example.demo.service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AppUiScreenFields;
import com.example.demo.model.PageDetails;
import com.example.demo.model.User;
import com.example.demo.model.UserRegistrationData;
import com.example.demo.model.submodel.AppUiScreenFieldsCustom;
import com.example.demo.model.submodel.UserRegistrationDataDTO;
import com.example.demo.repository.AppUiScreenDetailsRepo;
import com.example.demo.repository.AppUiScreenFieldsRepo;
import com.example.demo.repository.CommonTableDataRepo;
import com.example.demo.repository.UserRegistrationDataRepo;

@Service
public class ServiceLayer {

	@Autowired
	private AppUiScreenFieldsRepo appUiFieldsRepo;

	@Autowired
	private AppUiScreenDetailsRepo appUiDetailsRepo;

	@Autowired
	private CommonTableDataRepo commonTableDataRepo;

	@Autowired
	private UserRegistrationDataRepo userRegistrationDataRepo;

	// Generate random password for the first time account creation
	public String randPasswordGenerator() {
		int len = 10;
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();
	}

	// get all user information in json format
	public List<UserRegistrationData> getAllUserDetails() {
		return userRegistrationDataRepo.findAll();
	}

	// generate random password
	public String generatePassword() {
		return randPasswordGenerator();
	}

	// delete user by userName
	public String deleteUserRecord(String userName) {
		UserRegistrationData user = userRegistrationDataRepo.getUserByUserName(userName);
		try {
			if (user != null) {
				userRegistrationDataRepo.delete(user);
				return userName + " deleted successfully!";
			} else
				return "User does not exists";
		} catch (Exception e) {
			return "Something went wrong. Delete request failed";
		}
	}

	// get user by UserName
	public UserRegistrationData getUserByUsrName(String userName) {
		UserRegistrationData u = userRegistrationDataRepo.getUserByUserName(userName);
		if (u != null)
			return userRegistrationDataRepo.getUserByUserName(userName);
		else {
			System.out.println("User does not exist!");
			UserRegistrationData nullUser = new UserRegistrationData();
			nullUser.setFirstName(null);
			nullUser.setMiddleName(null);
			nullUser.setLastName(null);
			nullUser.setGender(null);
			nullUser.setPhoneNumber(null);
			nullUser.setEmailId(null);
			nullUser.setAddress(null);
			nullUser.setNationality(null);
			nullUser.setKnownLanguage(null);
			nullUser.setUserName(null);
			nullUser.setPassword(null);
			return nullUser;

		}
	}

	// check whether user exists or not
	public boolean chechUserExists(User user) {

		UserRegistrationData u = userRegistrationDataRepo.findByUserNameAndPassword(user.getUserId(),
				user.getPassword());
		// System.out.println(u);
		if (u != null) {
			System.out.println("User exist: " + true);
			return true;
		} else {
			System.out.println("User exist: " + false);
			return false;
		}
	}

	// send page info to client side
	public PageDetails sendPageDetailsToClient(String screenNumber) {
		PageDetails pd = new PageDetails();
		pd.setScreenName(appUiDetailsRepo.displayPageDetails(screenNumber));

		List<AppUiScreenFields> tempList = appUiFieldsRepo.pageUiFields(screenNumber);

		AppUiScreenFieldsCustom a;
		List l;

		List<AppUiScreenFieldsCustom> subList = new ArrayList<AppUiScreenFieldsCustom>();
		;

		for (AppUiScreenFields i : tempList) {
			a = new AppUiScreenFieldsCustom();
			l = new ArrayList();

			a.setFieldsToDisplay(i.getFieldsToDisplay());
			a.setFieldsOrderToDisplay(i.getFieldsOrderToDisplay());
			a.setUiType(i.getUiType());
			a.setValidator(i.getValidator());
			a.setFieldGroup(i.getFieldGroup());

			String dataToFetch = i.getSelect_option();
			if (dataToFetch != null) {
				if (i.getSelect_option().equals(dataToFetch)) {
					List temp = commonTableDataRepo.fetchData(dataToFetch);
					for (Object ii : temp) {
						// System.out.println(ii);
						l.add(ii);
					}
				}

			}

			a.setSelect_option(l);

			a.setDefault_option(i.getDefault_option());
			a.setSubmitModel(i.getSubmitModel());
			subList.add(a);

		}

		pd.setScreenUiDetails(subList);
		System.out.println("--> " + pd);
		return pd;
	}

	public UserRegistrationData registrationFormSubmitAction(UserRegistrationDataDTO dtoObject) {
		// Mapping the DTO object into entity object
		System.out.println();
		UserRegistrationData userRegistrationData = new UserRegistrationData();
		userRegistrationData.setFirstName(dtoObject.getFirstName());
		userRegistrationData.setMiddleName(dtoObject.getMiddleName());
		userRegistrationData.setLastName(dtoObject.getLastName());
		userRegistrationData.setGender(dtoObject.getGender());
		userRegistrationData.setPhoneNumber(dtoObject.getPhoneNumber());
		userRegistrationData.setEmailId(dtoObject.getEmailId());
		userRegistrationData.setAddress(dtoObject.getAddress());
		// userRegistrationData.setNationality(String.join(",",
		// dtoObject.getNationality()));
		userRegistrationData.setNationality(dtoObject.getNationality());
		userRegistrationData.setKnownLanguage(dtoObject.getKnownLanguage());
		userRegistrationData.setUserName(dtoObject.getUserName());
		userRegistrationData.setPassword(dtoObject.getPassword());
		//userRegistrationData.setm

		// converting list into string with comma separator
		//
		System.out.println(userRegistrationData.toString());
		userRegistrationDataRepo.save(userRegistrationData);

		return userRegistrationData;
	}
}

/*
 * // send page info to client side public PageDetails
 * sendPageDetailsToClient(String screenNumber) { PageDetails pd = new
 * PageDetails();
 * 
 * pd.setScreenName(appUiDetailsRepo.displayPageDetails(screenNumber));
 * pd.setScreenUiDetails((appUiFieldsRepo.pageUiFields(screenNumber)));
 * 
 * 
 * return pd; }
 * 
 */
