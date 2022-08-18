package com.doctor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.demo.repository.HospitalRepository;
import com.doctor.demo.repository.Hospital_details;
@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalRepository hospitalrepository;
	 @Override
	public Hospital_details saveHospitalDetails(Hospital_details hospitaldetails) {
		 Hospital_details hospital= hospitalrepository.save(hospitaldetails);
		 return hospital;
	}
//	@Override
//	public Hospital_details saveHospitalDetails(Hospital_details hospitaldetails) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Hospital_details saveHospitalDetails(Hospital_details hospitaldetails) {
//		// TODO Auto-generated method stub
//		return ;
//	}


}
