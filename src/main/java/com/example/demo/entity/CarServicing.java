package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "carServicing")
public class CarServicing {
	@Id
	private Integer mechanicId;
	@NotBlank
	@NotNull
	private String mechanicName;
	@OneToOne(mappedBy = "carServicing")
	private Car car;

	public CarServicing() {

	}

	public CarServicing(Integer mechanicId, @NotBlank @NotNull String mechanicName, Car car) {
		super();
		this.mechanicId = mechanicId;
		this.mechanicName = mechanicName;
		this.car = car;
	}

	public Integer getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(Integer mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getMechanicName() {
		return mechanicName;
	}

	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
