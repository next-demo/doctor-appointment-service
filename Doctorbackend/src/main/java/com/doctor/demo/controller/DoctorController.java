package com.doctor.demo.controller;


import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

import com.doctor.demo.repository.Doctor_Details;
import com.doctor.demo.service.DoctorService;


@Controller
@RequestMapping("/api/doctor")
public class DoctorController {
	@Autowired
	DoctorService doctorservice;
	@PostMapping("/doctor_details")
	public @ResponseBody Doctor_Details savedoctor(@RequestBody Doctor_Details doctordetails) {
		return 	doctorservice.saveDoctorDetails(doctordetails);
		
	}
	
//	@OneToMany(mappedBy = "doctor_details")
////    Set<Orders> orders;
//	// fetch 
	@GetMapping("/doctor_details")
	public @ResponseBody List<Doctor_Details> getDoctors() {
		return doctorservice.fetchDoctorDetails();
	}
//	
//	//update
//	@PutMapping("/doctor_details")
//	public @ResponseBody Doctor_Details updateDoctorDetails(@RequestBody Doctor_Details doctordetails,String doctorname) {
//		return doctorservice.updatedoctordetails(doctordetails, doctorname);
//	}
//	
	//delete
	@DeleteMapping
	public void deleteDoctorDetails(@RequestBody String doctorname) {
		doctorservice.deleteDoctorDetails(doctorname);
	}
//	
//	
//	@GetMapping("/showdoctorbytype")
//	public @ResponseBody List<Doctor_Details> findBySeaters(@RequestParam String type){
//		return doctorservice.findByDoctorType(type);
//	}
//	
//	@GetMapping("/showdoctorbyexperience")
//	public @ResponseBody List<Doctor_Details> findByDoctorType(@RequestParam Integer doctorexperience){
//		return doctorservice.findByDoctorExperience(doctorexperience);
//	}

}
