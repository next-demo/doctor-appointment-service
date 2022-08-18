package com.doctor.demo.repository;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name ="user_details")
public class User_Details {
	@Id
	@JsonProperty("username")
	private String username;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	@JsonProperty("id")
	private Integer id;
	@Column(name ="firstname")
	@JsonProperty("firstname")
	private String firstname;
	@Column(name ="lastname")
	@JsonProperty("lastname")
	private String lastname;
	@Column(name ="email")
	@JsonProperty("email")
	private String email;
	@Column(name ="pass")
	@JsonProperty("pass")
	private String pass;
	@Column(name ="aadharno")
	@JsonProperty("aadharno")
	private long aadharno;
	
//	@OneToMany(mappedBy = "user_details", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    Set<Orders> orders;
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	
	public void setUserName(String userid, String username) {
		this.username = username;
	}
	public String getUserName() {
		return this.username;
	}
	
	public void setFirst(String first) {
		this.firstname = first;
	}
	public String getFirst() {
		return this.firstname;
	}
	
	public void setLast(String last) {
		this.lastname = last;
	}
	
	public String getLast() {
	  return this.lastname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getPass() {
		return this.pass;
	}
	
	public void setAadhar(Long aadhar) {
		this.aadharno = aadhar;
	}
	
	public Long getAadhar() {
		return this.aadharno;
	}
	
	@Override
	public String toString() {
		return "User{" + "id:"  + this.id +
				"firstname:" + this.firstname +
				"lastname:" + this.lastname +
				"username:" + this.username +
				"email:" + this.email +
				"aadharno:" + this.aadharno +
				"pass" + this.pass +"}"; 
	}

}
