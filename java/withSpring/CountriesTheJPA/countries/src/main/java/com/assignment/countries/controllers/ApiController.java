package com.assignment.countries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.countries.services.ApiService;


@RestController
public class ApiController {
	
	@Autowired
	ApiService ApiService;
	
	@RequestMapping("/api/q1")
	public List<Object[]> a1() {
		List<Object[]> all = ApiService.allCountries();
		
		return all;
	}
	
	@RequestMapping("/api/q2")
	public List<Object[]> q2() {
		List<Object[]> all = ApiService.displayTotalCities();
		
		return all;
	}
	
	@RequestMapping("/api/q3")
	public List<Object[]> q3() {
		List<Object[]> all = ApiService.mexicoPopulation();
		
		return all;
	}
	
	@RequestMapping("/api/q4")
	public List<Object[]> q4() {
		List<Object[]> all = ApiService.allLanguagesEachCountry();
		
		return all;
	}
	
	@RequestMapping("/api/q5")
	public List<Object[]> q5() {
		List<Object[]> all = ApiService.allCountriesWithSurface();
		
		return all;
	}
	
	@RequestMapping("/api/q6")
	public List<Object[]> q6() {
		List<Object[]> all = ApiService.countrieswithConstitutionalMonarchy();
		
		return all;
	}
	
	@RequestMapping("/api/q7")
	public List<Object[]> q7() {
		List<Object[]> all = ApiService.citiesOfArgentina();
		
		return all;
	}
	
	@RequestMapping("/api/q8")
	public List<Object[]> q8() {
		List<Object[]> all = ApiService.countriesEachRegion();
		
		return all;
	}
	
}
