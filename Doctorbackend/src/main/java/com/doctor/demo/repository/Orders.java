// package com.doctor.demo.repository;

// import java.sql.Date;

// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;

// import com.fasterxml.jackson.annotation.JsonProperty;

// @Entity
// public class Orders {
// 	@Id
// 	@JsonProperty("orderid")
// 	private Integer orderid;

// 	@JsonProperty("customer_name")
// 	private String customer_name;
	
// 	@JsonProperty("final_price")
// 	private Long final_price;
	
// 	@JsonProperty("book_date")
// 	private java.sql.Date book_date;
	
	
// 	//	
// 	@JsonProperty("images")
// 	private String images;
// 	@JsonProperty("order_status")
// 	private String order_status;
// 	@ManyToOne
//     @JoinColumn(name = "username")
//     private User_Details userdetails;

//     @ManyToOne
//     @JoinColumn(name = "doctorname")
// 	private Doctor_Details doctordetails1;	
    
//     @ManyToOne
//     @JoinColumn(name = "hospitalname")
// 	private Hospital_details hospitaldetails;
		 
// 	public Orders(Integer orderid, String customer_name, Long final_price, Date book_date, String images,
// 			String order_status, User_Details userdetails, Doctor_Details doctordetails1,
// 			Hospital_details hospitaldetails, Doctor_Details hospitaldetails2) {
// 		super();
// 		this.orderid = orderid;
// 		this.customer_name = customer_name;
// 		this.final_price = final_price;
// 		this.book_date = book_date;
// 		this.images = images;
// 		this.order_status = order_status;
// 		this.userdetails = userdetails;
// 		this.doctordetails1 = doctordetails1;
// 		this.hospitaldetails = hospitaldetails;
		
// 	}

	
	
	
// 	Orders(){};
	
// 	public User_Details getUserdetails() {
// 		return userdetails;
// 	}

// 	public void setUserdetails(User_Details userdetails) {
// 		this.userdetails = userdetails;
// 	}

// 	public Hospital_details getHospitaldetails() {
// 		return hospitaldetails;
// 	}

// 	public void setCarsdetails(Hospital_details hsopitaldetails) {
// 		this.hospitaldetails = hospitaldetails;
// 	}

// 	public Doctor_Details getDoctordetails() {
// 		return getDoctordetails();
// 	}

// 	public void setBikedetails(Doctor_Details doctordetails) {
// 		this.doctordetails1 = doctordetails;
// 	}

// 	public void setPickup_day(java.sql.Date book_date) {
// 		this.book_date = book_date;
// 	}

// 	public void setBook_date(java.sql.Date book_date) {
// 		this.book_date = book_date;
// 	}

//	@Override
//	public String toString() {
//		return "Orders [orderid=" + orderid + ", customer_name=" + customer_name + ", final_price=" + final_price
//				+  pickup_day=" + pickup_day + ", return_date=" + return_date
//				+ ", images=" + images + ", order_status=" + order_status + ", userdetails=" + userdetails
//				+ ", carsdetails=" + carsdetails + ", bikedetails=" + bikedetails + "]";
	

// 	public Orders(Integer orderid, String customer_name, Long final_price, 
// 			java.sql.Date book_date,  String images, String order_status,
// 			User_Details userdetails, Doctor_Details doctordetails, Hospital_details Hospitaldetails) {
// 		super();
// 		this.orderid = orderid;
// 		this.customer_name = customer_name;
// 		this.final_price = final_price;
		
// 		this.book_date = book_date;
// 		this.images = images;
// 		this.order_status = order_status;
// 		this.userdetails = userdetails;
// 		this.doctordetails1 = doctordetails;
// 		this.hospitaldetails = Hospitaldetails;
// 	}
// }

//	public Integer getOrderid() {
//		return orderid;
//	}
//	public void setOrderid(Integer orderid) {
//		this.orderid = orderid;
//	}
//	public String getCustomer_name() {
//		return customer_name;
//	}
//	public void setCustomer_name(String customer_name) {
//		this.customer_name = customer_name;
//	}
//	public Long getFinal_price() {
//		return final_price;
//	}
//	public void setFinal_price(Long final_price) {
//		this.final_price = final_price;
//	}
//	
//	public java.sql.Date getBook_date() {
//		return book_date;
//	}
//	public void setBook_date(Date book_date) {
//		
//		this.book_date = book_date;
//	}
//	public String getImages() {
//		return images;
//	}
//	public void setImages(String images) {
//		this.images = images;
//	}
//	public String getOrder_status() {
//		return order_status;
//	}
//	public void setOrder_status(String order_status) {
//		this.order_status = order_status;
//	}
//	public User_Details getUser_details() {
//		return userdetails;
//	}
//	public void setUser_details(User_Details user_details) {
//		this.userdetails = user_details;
//	}
//	public Hospital_details gethospital_details() {
//		return hospitaldetails;
//	}
//	public void setHospital_details(Hospital_details hospital_details) {
//		this.hospitaldetails = hospitaldetails;
//	}
//	public Doctor_Details getDoctor_Details() {
//		return doctordetails1;
//	}
//	public void setBike_details(Doctor_Details doctor_details) {
//		this.doctordetails1 = doctor_details;
//	}
//
//	public void setHospitaldetails(Doctor_Details hospitaldetails) {
//		hospitaldetails = hospitaldetails;
//	}
//}
	
