package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CarService;
import com.example.demo.entity.Car;

@RestController
public class CarController {
	@Autowired
	CarService carService;
	@PostMapping("/car")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void getCar(@RequestBody Car car ) {
		carService.saveCarDetails(car);
	}
}
