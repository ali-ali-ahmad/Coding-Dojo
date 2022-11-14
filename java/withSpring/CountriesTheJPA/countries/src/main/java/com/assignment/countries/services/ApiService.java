package com.assignment.countries.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.countries.repositories.WorldRepository;


@Service
public class ApiService {

	@Autowired
	WorldRepository worldrepository;
	
	
	public List<Object[]> allCountries(){
		
		return worldrepository.allCountries();
	}  
	
	public List<Object[]> displayTotalCities(){
		
		return worldrepository.displayTotalCities();
	}  
	
	public List<Object[]> mexicoPopulation(){
		
		return worldrepository.mexicoPopulation();
	}  
	
	public List<Object[]> allLanguagesEachCountry(){
		
		return worldrepository.allLanguagesEachCountry();
	}
	
	public List<Object[]> allCountriesWithSurface(){
		
		return worldrepository.allCountriesWithSurface();
	}
	
	public List<Object[]> countrieswithConstitutionalMonarchy(){
		
		return worldrepository.countrieswithConstitutionalMonarchy();
	}
	
	public List<Object[]> citiesOfArgentina(){
		
		return worldrepository.citiesOfArgentina();
	}
	
	public List<Object[]> countriesEachRegion(){
		
		return worldrepository.countriesEachRegion();
	}
	
}

