package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Invoice;

import com.example.demo.repository.InvoiceRepository;
@Service
public class InvoiceService {
	@Autowired
	
 InvoiceRepository invoiceRepository;
	public Iterable<Invoice> getAllInvoices() {
		
		return invoiceRepository.findAll();
	}

	public Optional<Invoice> getInvoice(Integer id) {
		
		return invoiceRepository.findById(id);
	}

	public void saveInvoiceDetail(@Valid Invoice invoice) {
		invoiceRepository.save(invoice);
		
	}

	public void deleteInvoiceDetail(Integer id) {
		invoiceRepository.deleteById(id);
		
	}

}
