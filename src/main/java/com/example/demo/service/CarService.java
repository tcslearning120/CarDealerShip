package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
@Service
public class CarService {
@Autowired
CarRepository carRepository;
	public void saveCarDetails(Car car) {
		// TODO Auto-generated method stub
		carRepository.save(car);
	}

}
