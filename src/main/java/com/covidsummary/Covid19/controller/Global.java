package com.covidsummary.Covid19.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Global {

	private @JsonProperty("NewConfirmed") int NewConfirmed;
	private @JsonProperty("TotalConfirmed") int TotalConfirmed;
	private @JsonProperty("NewDeaths") int NewDeaths;
	private @JsonProperty("TotalDeaths") int TotalDeaths;
	private @JsonProperty("NewRecovered") int NewRecovered;
	private @JsonProperty("TotalRecovered") int TotalRecovered;
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
	public Global(int newConfirmed, int totalConfirmed, int newDeaths, int totalDeaths, int newRecovered,
			int totalRecovered) {
		NewConfirmed = newConfirmed;
		TotalConfirmed = totalConfirmed;
		NewDeaths = newDeaths;
		TotalDeaths = totalDeaths;
		NewRecovered = newRecovered;
		TotalRecovered = totalRecovered;
	}
	
	public Global() {
		
	}
	
	
}
