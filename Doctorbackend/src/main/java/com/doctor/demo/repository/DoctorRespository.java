package com.doctor.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface DoctorRespository extends JpaRepository<Doctor_Details,String>{

	@Query("Select b from Doctor_Details as b where b.location = ?1")
	List<Doctor_Details> findByLocation(String location);
////	
////	@Query("Select b from Doctor_Details as b where b.doctortype= ?1")
//     List<Doctor_Details> findBySpeciality(String speciality);
     
	@Query("Select u from Doctor_Details as u where u.doctorname= ?1")
	public  List<Doctor_Details> findByDoctorName(String Doctorname);
}
