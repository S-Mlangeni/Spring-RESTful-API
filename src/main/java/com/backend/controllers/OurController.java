package com.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.OurEntity;
import com.backend.search.OurSearch;
import com.backend.service.OurService;

@RestController /*Declares this class as a rest API which the allows the 
use of rest end-points. */
public class OurController {
	@GetMapping("/first")
	public String firstmethod() {
		return "My game is super tight!!!";
	}
	@PostMapping("/second")
	public List<String> secondmethod() {
		return List.of("Second method! Well done!", "yes it's a list");
	}
	
	//@Autowired
	//OurEntity tableObj;
	
	@PostMapping("/third")
	public OurEntity thirdmethod() {
		return new OurEntity(1L, "sdsadf", 87668, "sdsacs", "sadfsafv");
	}
	
	@Autowired
	OurService service;
	
	@PostMapping("/entry")
	/* @RequestBody matches/maps and assigns the incoming json object properties 
	to those defined in the class object. */ 
	public OurEntity fourthmethod(@RequestBody OurEntity data) {
		return service.serve(data);
	}
	
	@PostMapping("/search")
	public Boolean fifthmethod(@RequestBody OurSearch searchdata) {
		return service.searchingdb(searchdata);
	}
	
}
