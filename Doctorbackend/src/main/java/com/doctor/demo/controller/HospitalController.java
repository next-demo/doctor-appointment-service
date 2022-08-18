package com.doctor.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doctor.demo.repository.Doctor_Details;
import com.doctor.demo.repository.Hospital_details;
import com.doctor.demo.service.DoctorService;
import com.doctor.demo.service.HospitalService;

@Controller
@RequestMapping("/api/hospital")
public class HospitalController {
	@Autowired
	HospitalService Hospitalservice;
	@PostMapping("/hospital")
	public @ResponseBody Hospital_details savedoctor(@RequestBody Hospital_details hospitaldetails) {
		return 	Hospitalservice.saveHospitalDetails(hospitaldetails);
		
	}
	
//	@OneToMany(mappedBy = "doctor_details")
////    Set<Orders> orders;
//	// fetch 
//	@GetMapping("/hospital")
//	public @ResponseBody List<Hospital_details> getHospital() {
//		return Hospitalservice.fetchHospitalDetails();
////	}
}