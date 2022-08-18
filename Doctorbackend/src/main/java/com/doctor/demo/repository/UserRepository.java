package com.doctor.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepository extends JpaRepository<User_Details, String> {
		@Query("Select u from User_Details as u where u.username= ?1")
		public  List<User_Details> findByUserName(String userName);
}