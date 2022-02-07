package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.CarServicing;


public interface CarServiceRepository extends CrudRepository<CarServicing, Integer>{

}
