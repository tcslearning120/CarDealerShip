package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Car")
public class Car {
	@Id
	private Integer carModelNo;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String carModelName;
	@NotBlank
	@NotNull
	@Size(max = 15)
	private String carType;
	@ManyToOne(targetEntity = Saler.class, fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "saler_id", referencedColumnName = "salerId")
	private Saler saler;
	@ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "customer_id", referencedColumnName = "customerId")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mechanic_id", referencedColumnName = "mechanicId")
	private CarServicing carServicing;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "invoice_id", referencedColumnName = "invoiceId")
	private Invoice invoice;

	public Car() {

	}

	public Car(Integer carModelNo, @NotBlank @NotNull @Size(max = 50) String carModelName,
			@NotBlank @NotNull @Size(max = 15) String carType, Saler saler, Customer customer,
			CarServicing carServicing, Invoice invoice) {
		super();
		this.carModelNo = carModelNo;
		this.carModelName = carModelName;
		this.carType = carType;
		this.saler = saler;
		this.customer = customer;
		this.carServicing = carServicing;
		this.invoice = invoice;
	}

	public Integer getCarModelNo() {
		return carModelNo;
	}

	public void setCarModelNo(Integer carModelNo) {
		this.carModelNo = carModelNo;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Saler getSaler() {
		return saler;
	}

	public void setSaler(Saler saler) {
		this.saler = saler;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CarServicing getCarServicing() {
		return carServicing;
	}

	public void setCarServicing(CarServicing carServicing) {
		this.carServicing = carServicing;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
