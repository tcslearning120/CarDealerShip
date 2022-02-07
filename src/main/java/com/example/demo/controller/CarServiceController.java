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

import com.example.demo.entity.CarServicing;
import com.example.demo.service.CarServiceService;



@RestController
public class CarServiceController {
	@Autowired 
	CarServiceService carService;
	
	@GetMapping("/carservice")
	Iterable<CarServicing> getCarServices() {
		 return carService.getCarServicesDetails();
	}
	
    @GetMapping("/carservice/{id}")
   Optional<CarServicing> getCarService(@PathVariable("id") Integer id) {
	    return carService.getCarServiceDetail(id);
    }
    
	@PostMapping("/carservice")
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatCarsService(@RequestBody @Valid  CarServicing carServicing) {
		 carService.saveCarServiceDetail(carServicing);
	}

	@DeleteMapping("/carservice/{id}")
	void deleteSaler(@PathVariable("id") Integer id) {
	carService.deleteCarServiceDetail(id);
	}
}
