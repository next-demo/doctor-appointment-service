package com.doctor.demo.service;

import java.util.List;


import com.doctor.demo.repository.Doctor_Details;



public interface DoctorService {
	// create/save
	public Doctor_Details saveDoctorDetails(Doctor_Details doctordetails);

	public List<Doctor_Details> fetchDoctorDetails(String doctorname);

	public void deleteDoctorDetails(String doctorname);

	 
	List<Doctor_Details> fetchDoctorDetails();
	
	
//	public void deleteDoctorDetails(String doctorname);

//	public List<Doctor_Details> findByDoctorname(String doctorname);
//	S
	

}
