package com.covidsummary.Covid19.repo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.covidsummary.Covid19.controller.Country;
import com.covidsummary.Covid19.controller.CountryData;
import com.covidsummary.Covid19.controller.Summary;

@Component
public class SummaryRepo {

	//@Autowired
	//RestTemplate temp;
	
	public Summary getSummary() {
		RestTemplate temp = new RestTemplate();
		Summary summary =  temp.getForObject("https://api.covid19api.com/summary", Summary.class);
		summary.setCountries(summary.getCountries().stream().sorted(Comparator.comparingInt(Country::getTotalConfirmed).reversed()).collect(Collectors.toList()));
		
		return summary;
		
	}

	public List<CountryData> getCountryData(String country) {
		RestTemplate temp = new RestTemplate();
		ResponseEntity<CountryData[]> dataset= temp.getForEntity("http://COUNTRY-SERVER/bycountry/"+country, CountryData[].class);
				return Arrays.asList(dataset.getBody());
	}
}
