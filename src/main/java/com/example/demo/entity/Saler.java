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
@Table(name = "Saler")
public class Saler {
	@Id
	private Integer salerId;
	@NotBlank
	@NotNull
	private String salespersonName;

	@OneToMany(targetEntity = Car.class, mappedBy = "saler", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Car> cars;

	public Saler() {

	}


	public Saler(Integer salerId, @NotBlank @NotNull String salespersonName, List<Car> cars) {
		super();
		this.salerId = salerId;
		this.salespersonName = salespersonName;
		this.cars = cars;
	}


	public Integer getSalerId() {
		return salerId;
	}

	public void setSalerId(Integer salerId) {
		this.salerId = salerId;
	}

	public String getSalespersonName() {
		return salespersonName;
	}

	public void setSalespersonName(String salespersonName) {
		this.salespersonName = salespersonName;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	

}
