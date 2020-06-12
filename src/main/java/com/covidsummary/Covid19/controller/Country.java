package com.covidsummary.Covid19.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Country {

	
	 private @JsonProperty("Country") String Country;

	    private @JsonProperty("CountryCode") String CountryCode;

	    private @JsonProperty("Slug") String Slug;

	    private @JsonProperty("NewConfirmed") int NewConfirmed;

	    private @JsonProperty("TotalConfirmed") int TotalConfirmed;

	    private @JsonProperty("NewDeaths") int NewDeaths;

	    private @JsonProperty("TotalDeaths") int TotalDeaths;

	    private @JsonProperty("NewRecovered") int NewRecovered;

	    private @JsonProperty("TotalRecovered") int TotalRecovered;

	    private @JsonProperty("Date") String Date;

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public String getCountryCode() {
			return CountryCode;
		}

		public void setCountryCode(String countryCode) {
			CountryCode = countryCode;
		}

		public String getSlug() {
			return Slug;
		}

		public void setSlug(String slug) {
			Slug = slug;
		}

		public int getNewConfirmed() {
			return NewConfirmed;
		}

		public void setNewConfirmed(int newConfirmed) {
			NewConfirmed = newConfirmed;
		}

		public int getTotalConfirmed() {
			return TotalConfirmed;
		}

		public void setTotalConfirmed(int totalConfirmed) {
			TotalConfirmed = totalConfirmed;
		}

		public int getNewDeaths() {
			return NewDeaths;
		}

		public void setNewDeaths(int newDeaths) {
			NewDeaths = newDeaths;
		}

		public int getTotalDeaths() {
			return TotalDeaths;
		}

		public void setTotalDeaths(int totalDeaths) {
			TotalDeaths = totalDeaths;
		}

		public int getNewRecovered() {
			return NewRecovered;
		}

		public void setNewRecovered(int newRecovered) {
			NewRecovered = newRecovered;
		}

		public int getTotalRecovered() {
			return TotalRecovered;
		}

		public void setTotalRecovered(int totalRecovered) {
			TotalRecovered = totalRecovered;
		}

		public String getDate() {
			return Date;
		}

		public void setDate(String date) {
			Date = date;
		}
		
		public Country() {
			
		}

		public Country(String country, String countryCode, String slug, int newConfirmed, int totalConfirmed,
				int newDeaths, int totalDeaths, int newRecovered, int totalRecovered, String date) {
			super();
			Country = country;
			CountryCode = countryCode;
			Slug = slug;
			NewConfirmed = newConfirmed;
			TotalConfirmed = totalConfirmed;
			NewDeaths = newDeaths;
			TotalDeaths = totalDeaths;
			NewRecovered = newRecovered;
			TotalRecovered = totalRecovered;
			Date = date;
		}
		
		
	    
	    
}
