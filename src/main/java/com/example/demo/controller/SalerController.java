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

import com.example.demo.entity.Saler;
import com.example.demo.service.SalerService;
@RestController
public class SalerController {
	@Autowired
	SalerService salerService;

	@GetMapping("/saler")
	Iterable<Saler> getSalers() {
		 return salerService.getSalersDetails();
	}
	
    @GetMapping("/saler/{id}")
   Optional<Saler> getSaler(@PathVariable("id") Integer id) {
	    return salerService.getSalerDetail(id);
    }
    
	@PostMapping("/saler")//create
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatSaler(@RequestBody @Valid Saler saler) {
		 salerService.saveSalerDetail(saler);
	}

	@DeleteMapping("/saler/{id}")
	void deleteSaler(@PathVariable("id") Integer id) {
	salerService.deleteSalerDetail(id);
	}
}
