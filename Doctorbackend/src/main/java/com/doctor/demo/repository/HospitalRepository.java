package com.doctor.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface HospitalRepository extends JpaRepository<Hospital_details,String>{

//@Query("Select b from Doctor_Details as b where b.experience = ?1")
List<Hospital_details> findByLocation(String location);
//
////@Query("Select b from Doctor_Details as b where b.doctortype= ?1")
List<Hospital_details> findByName(String name);
 
//@Query("Select u from Doctor_Details as u where u.doctorname= ?1")
//public  _Details> findByDoctorName(String Doctorname);
}