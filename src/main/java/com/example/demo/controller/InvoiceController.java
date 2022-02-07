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

import com.example.demo.entity.Invoice;

import com.example.demo.service.InvoiceService;

@RestController
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;

	@GetMapping("/invoice")
	Iterable<Invoice> getInvoices() {
		return invoiceService.getAllInvoices();
	}

	@GetMapping("/invoice/{id}")
	Optional<Invoice> getInvoice(@PathVariable("id") Integer id) {
		return invoiceService.getInvoice(id);
	}

	@PostMapping("/invoice") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatInvoice(@RequestBody @Valid Invoice invoice) {
		invoiceService.saveInvoiceDetail(invoice);
	}

	@DeleteMapping("/invoice/{id}")
	void deleteInvoice(@PathVariable("id") Integer id) {
		invoiceService.deleteInvoiceDetail(id);
	}
}
