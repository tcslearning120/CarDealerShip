package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarServicing;
import com.example.demo.repository.CarServiceRepository;


@Service
public class CarServiceService {
@Autowired
CarServiceRepository carServiceRepository;
	public Iterable<CarServicing> getCarServicesDetails() {
		
		return  carServiceRepository.findAll();
	}

	public Optional<CarServicing> getCarServiceDetail(Integer id) {
		
		return  carServiceRepository.findById(id);
	}

	public void saveCarServiceDetail(@Valid CarServicing carServicing) {
		// TODO Auto-generated method stub
		 carServiceRepository.save(carServicing);
		
	}

	public void deleteCarServiceDetail(Integer id) {
		// TODO Auto-generated method stub
		 carServiceRepository.deleteById(id);
		
	}

}
