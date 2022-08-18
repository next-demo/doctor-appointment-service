package com.doctor.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository<Orders, Integer>{

	List<Orders> findByUsername(String username);

	Long calculateRevenue();

	List<Orders> findOrdersByUsername(String username);
	}