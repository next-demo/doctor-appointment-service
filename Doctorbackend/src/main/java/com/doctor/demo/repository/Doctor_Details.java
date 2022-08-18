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
@Table(name ="doctor_details")
public class Doctor_Details {
	@Id
	@JsonProperty("doctorname")
	private String doctorname;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id")
	@JsonProperty("id")
	private Integer id;
	@Column(name ="speciality")
	@JsonProperty("Speciality")
	private String speciality;
	
	@Column(name ="experience")
	@JsonProperty("Experience")
	private Integer experience;
	@Column(name ="price")
	@JsonProperty("Price")
	private Long Price;
	@Column(name ="pass")
	@JsonProperty("pass")
	private String pass;
	@Column(name ="location")
	@JsonProperty("Location")
	private String location;
	
//	@OneToMany(mappedBy = "doctor_details", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    Set orders;

	
	Doctor_Details(){};
	Doctor_Details(Integer id,String speciality, String doctorname, Integer experience,Long price, String pass, String location){
		this.id = id;
		
		this.doctorname = doctorname;
		this.speciality = speciality;
		this.experience = experience;
		this.Price = price;
		this.pass = pass;
		this.location= location;
	}
	public void setPrice(Long Price) {
		this.Price = Price;
	}
	public Long getPrice() {
		return this.Price;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getid() {
		return this.id;
	}
	
	public void setDoctorName(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDoctorName() {
		return this.doctorname;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public Integer getExperience() {
		return this.experience;
	}
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLocation() {
		return location;
	}
	public void setLocaion(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Doctor{" + "id:"  + this.id +
				"Speciality:" + this.speciality +
				"Doctor_name:" + this.doctorname +
				"Experience:" + this.experience + "pass:" + this.pass +"location:" + this.location +
				"}"; 
	}
	
	

}
