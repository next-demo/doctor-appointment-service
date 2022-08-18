// package com.doctor.demo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

// import com.doctor.demo.repository.Orders;
// import com.doctor.demo.service.OrdersService;

// @Controller
// @RequestMapping("api/orders")
// public class OrderController {
// 	@Autowired
// 	OrdersService ordersservice;
	
// 	@GetMapping("/get")
// 	public @ResponseBody List<Orders> getAllOrders(){
// 		return ordersservice.getAllOrders();
// 	}
	
// 	// post
// 	@PostMapping("/postorder")
// 	public @ResponseBody Orders postOrders(@RequestBody Orders order) {
// 		return ordersservice.postOrders(order);
// 	}
	
// 	//delete
// 	 @DeleteMapping("/deleteorder/{id}")
// 	 public void deleteOrder(@PathVariable Integer id ) {
// 		 ordersservice.deleteOrders(id);
// 	 }
//	 
//	 @GetMapping("getbyid/{username}")
//	 public @ResponseBody List<Orders> getOrderById(@PathVariable String username){
//		 return ordersservice.findByUsername(username);
//		 
//	 }
//	 
//	 @GetMapping("/getrevenue")
//	public @ResponseBody Long calculateRevenue() {
//		return ordersservice.calculateRevenue();
//			
//		}
	 
//	 @GetMapping("/getordersbtuser/{username}")
//	 public @ResponseBody List<Orders> findOrdersByUsername(@PathVariable String username){
//		 return ordersservice.findOrdersByUsername(username);
//	 }


}
