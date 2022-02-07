package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	private Integer customerId;
	@NotBlank
	@NotNull
	private String customerName;
	@OneToMany(targetEntity = Car.class, mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Car> cars;

	public Customer() {

	}

	public Customer(Integer customerId, @NotBlank @NotNull String customerName, List<Car> cars) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.cars = cars;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
