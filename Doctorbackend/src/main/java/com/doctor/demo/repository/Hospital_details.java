package com.doctor.demo.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "hospital")
public class Hospital_details {
	@Id
	@JsonProperty("name")
private String name;
	@JsonProperty("location")
	@Column(name="location")
private String location;
	@JsonProperty("since")
	@Column(name="since")
private Integer since;
	@JsonProperty("beds")
	@Column(name="beds")
private Integer beds;


public Hospital_details(String name, String location, Integer since, Integer beds) {
	super();
	this.name = name;
	this.location = location;
	this.since = since;
	this.beds = beds;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Integer getSince() {
	return since;
}
public void setSince(Integer since) {
	this.since = since;
}
public Integer getBeds() {
	return beds;
}
public void setBeds(Integer beds) {
	this.beds = beds;
}

}
