package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PageDetails;
import com.example.demo.model.User;
import com.example.demo.model.UserRegistrationData;
import com.example.demo.model.submodel.UserRegistrationDataDTO;
import com.example.demo.repository.UserDetailsRepo;
import com.example.demo.service.ServiceLayer;

@RestController
@RequestMapping("/welcome")
public class UserController {
	@Autowired
	ServiceLayer serviceLayer;

	@Autowired
	UserDetailsRepo userRepo;

	// Registration form - SAVE DATA
	@RequestMapping(value = "/saveregisterform", consumes = { "application/json" }, method = RequestMethod.POST)
	public UserRegistrationData saveRegisterForm(@RequestBody UserRegistrationDataDTO registerDataReceived) {

		return serviceLayer.registrationFormSubmitAction(registerDataReceived);
	}

	// Get all user information in Json format
	@RequestMapping(value = "/getallusers", produces = { "application/json" }, method = RequestMethod.GET)
	public List<UserRegistrationData> getUserDetails() {
		return serviceLayer.getAllUserDetails();
	}

	// Fetch user information
	@RequestMapping(value = "/getuser/{userName}", produces = { "application/json" }, method = RequestMethod.GET)
	public UserRegistrationData getUserDetails(@PathVariable("userName") String userName) {
		return serviceLayer.getUserByUsrName(userName);
	}

	// Delete particular user using Id
	@RequestMapping(value = "/deleteuser/{userName}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable String userName) {
		return serviceLayer.deleteUserRecord(userName);
	}

	// Check login credentials
	@PostMapping(value = "/checkuserexists", consumes = { "application/json" })
	public boolean searchUser(@RequestBody User user) {
		return serviceLayer.chechUserExists(user);
	}

	// send client side page UI Info
	@GetMapping(path = "/sendpageinfo/{screenNumber}", produces = { "application/json" })
	public PageDetails sendPageInfo(@PathVariable String screenNumber) {
		return serviceLayer.sendPageDetailsToClient(screenNumber);
	}

}

/*
 * @RequestMapping(value="/") public String login() {
 * System.out.println("Displaying login portal page"); return "login.xhtml"; }
 * 
 * // Update user details
 * 
 * @RequestMapping(value = "/updateuser", consumes = { "application/json" },
 * method = RequestMethod.PUT) public UserDetails updateOrSaveUser(@RequestBody
 * UserDetails user) { userRepo.save(user); return user; }
 */
