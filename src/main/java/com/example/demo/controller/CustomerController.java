package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customer")
	Iterable<Customer> getCustomer(){
		return customerService.getCustomerDetails();
		
	}
	@GetMapping("/customer/{id}")
	Optional<Customer>getCustomer(@PathVariable("id") Integer id){
		return customerService.getCustomerDetail(id);
	}
	
	@PostMapping("/customer")
	@ResponseStatus(code=HttpStatus.CREATED)
	void creatCustomer(@RequestBody @Valid Customer customer) {
		customerService.saveSalerDetail(customer);
	}
	@DeleteMapping("/customer/{id}")
	void deleteCustomer(@PathVariable("id") Integer id) {
	    customerService.deleteCustomerdetail(id);
	}
}
