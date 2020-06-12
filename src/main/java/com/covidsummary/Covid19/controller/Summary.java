package com.covidsummary.Covid19.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Summary {
	@JsonProperty("Global")
	private  Global globaldata;
	private @JsonProperty("Countries") List<Country> Countries;
	
	public Summary() {
		
	}
	
	public Summary(Global global, List<Country> countries) {
		this.globaldata = global;
		this.Countries = countries;
	}
	public Global getGlobal() {
		return globaldata;
	}
	public void setGlobal(Global global) {
		this.globaldata = global;
	}
	public List<Country> getCountries() {
		return Countries;
	}
	public void setCountries(List<Country> countries) {
		Countries = countries;
	}
	
	
}
