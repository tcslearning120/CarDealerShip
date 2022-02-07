package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerService {
@Autowired
	CustomerRepository customerRepository;
public Iterable<Customer> getCustomerDetails() {
	
	return customerRepository.findAll() ;
}
	public Optional<Customer> getCustomerDetail(Integer id) {
		
		return customerRepository.findById (id) ;
	}

	public void saveSalerDetail(@Valid Customer customer) {
		
		customerRepository.save(customer);
	}

	public void deleteCustomerdetail(Integer id) {
		 customerRepository.deleteById(id);
		
	}

	

	

}
