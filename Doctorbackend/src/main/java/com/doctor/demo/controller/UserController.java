package com.doctor.demo.controller;

import java.util.List;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doctor.demo.repository.User_Details;
import com.doctor.demo.service.UserRegister;



@Controller
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserRegister userregister;
	@PostMapping("/user_details")
	public @ResponseBody User_Details saveUser(@RequestBody User_Details userdetails) {
		return userregister.saveUserDetails(userdetails);
		
	}
	
	// fetch 
	@GetMapping("/user_details")
	public @ResponseBody List<User_Details> getUser() {
		return userregister.fetchUserDetails();
	}
	
//	//update
//	@PutMapping("/user_details")
//	public @ResponseBody User_Details updateUserDetails(@RequestBody User_Details userdetails,String username) {
//		return userregister.updateUserdetails(userdetails, username);
//	}
	
	//delete
	@DeleteMapping
	public void deleteUserDetails(@RequestBody String username) {
		userregister.deleteUserDetails(username);
	}
	
	//find user by user_name
	@GetMapping("/getusername/{userName}")
	public @ResponseBody List<User_Details> findByUserName(@PathVariable String userName) {
		// System.out.println(userregister.findByUserName(userName));
		return userregister.findByUserName(userName);
	}
	
	
}
