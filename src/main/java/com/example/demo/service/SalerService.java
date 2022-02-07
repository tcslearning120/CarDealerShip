package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Saler;
import com.example.demo.repository.SalerRepository;
@Service
public class SalerService {
@Autowired
  SalerRepository salerRepository;
	public Iterable<Saler> getSalersDetails() {
		
		return salerRepository.findAll();
	}

	public Optional<Saler> getSalerDetail(Integer id) {
		return  salerRepository.findById(id);
		
	}

	public void saveSalerDetail(@Valid Saler saler) {
		salerRepository.save(saler);
	}

	public void deleteSalerDetail(Integer id) {
	  salerRepository.deleteById(id);
		
	}

	
}
