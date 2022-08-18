package com.doctor.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.demo.repository.DoctorRespository;
import com.doctor.demo.repository.Doctor_Details;



@Service
public class DoctorServiceImpl implements DoctorService {

	
	@Autowired
	private DoctorRespository doctorrepository;
	
	// save
	@Override
	public Doctor_Details saveDoctorDetails(Doctor_Details doctordetails) {
		return doctorrepository.save(doctordetails);
	}
		//read
		
		@Override
		public List<Doctor_Details> fetchDoctorDetails(){
			return (List<Doctor_Details>)doctorrepository.findAll();
	}
//
		@Override
		public List<Doctor_Details> fetchDoctorDetails(String doctorname) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteDoctorDetails(String doctorname) {
			// TODO Auto-generated method stub
			
		}
	
}
	
	
