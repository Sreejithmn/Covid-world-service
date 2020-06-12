package com.covidsummary.Covid19.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidsummary.Covid19.repo.SummaryRepo;

@RestController
@RequestMapping("/summary")
@CrossOrigin
public class SummaryController {
	
	@Autowired
	SummaryRepo repo;
	
	
	@GetMapping(path = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
	public Summary getSummary() {
		
			System.out.println("here...........************");
			return repo.getSummary();
	}
	
	@GetMapping(path="/bycountry/{country}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CountryData> getCountryData(@PathVariable("country") String country) {
		return repo.getCountryData(country);
	}

}
