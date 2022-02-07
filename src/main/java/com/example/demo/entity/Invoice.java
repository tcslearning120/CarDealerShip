package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	private Integer invoiceId;
	@NotBlank
	@NotNull
	private String customerName;
	@NotBlank
	@NotNull
	private String salerName;
	@OneToOne(mappedBy = "invoice")
	private Car car;

	public Invoice() {
	}

	public Invoice(Integer invoiceId, @NotBlank @NotNull String customerName, @NotBlank @NotNull String salerName,
			Car car) {
		super();
		this.invoiceId = invoiceId;
		this.customerName = customerName;
		this.salerName = salerName;
		this.car = car;
	}

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSalerName() {
		return salerName;
	}

	public void setSalerName(String salerName) {
		this.salerName = salerName;
	}

}
