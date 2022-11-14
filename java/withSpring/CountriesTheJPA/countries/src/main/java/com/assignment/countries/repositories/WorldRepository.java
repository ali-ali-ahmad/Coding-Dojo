package com.assignment.countries.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.countries.models.Country;


@Repository
public interface WorldRepository extends CrudRepository<Country, Long>{
	
	@Query(value="select country.Name, countrylanguage.Language, countrylanguage.Percentage from country\r\n"
			+ "join countrylanguage on country.Code = countrylanguage.CountryCode where countrylanguage.Language = 'Slovene' order by Percentage desc;", nativeQuery=true)
	List<Object[]> allCountries();
		
	@Query(value="select country.Name as Country_name, count(city.Name) as total_number_of_cities from country\r\n"
			+ "join city on country.Code = city.CountryCode\r\n"
			+ "GROUP BY country.Name\r\n"
			+ "ORDER BY total_number_of_cities DESC;", nativeQuery=true)
	List<Object[]> displayTotalCities();
	  
	@Query(value="select city.id, city.Name, city.Population, country.Name from city \r\n"
			+ "join country on city.CountryCode = country.Code \r\n"
			+ "where country.Name = 'Mexico' and city.Population > 500000\r\n"
			+ "ORDER BY city.Population DESC;", nativeQuery=true)
	List<Object[]> mexicoPopulation();
	  
	@Query(value="select country.Name as country_name, countrylanguage.Language as 'languages_greater_than_89%', countrylanguage.Percentage from country\r\n"
			+ "join countrylanguage on country.Code = countrylanguage.CountryCode where countrylanguage.Percentage > '89%'\r\n"
			+ "ORDER BY countrylanguage.Percentage DESC;", nativeQuery=true)
	List<Object[]> allLanguagesEachCountry();
	  
	@Query(value="select country.Name as Country_name, country.SurfaceArea, country.Population from country \r\n"
			+ "where country.SurfaceArea < 501 and country.Population > 100000;", nativeQuery=true)
	List<Object[]> allCountriesWithSurface();
	  
	@Query(value="select country.Name, country.GovernmentForm, country.LifeExpectancy, country.Capital from country\r\n"
			+ "where country.GovernmentForm like \"%Constitutional Monarchy%\" and country.Capital > 200 and country.LifeExpectancy > 75;", nativeQuery=true)
	List<Object[]> countrieswithConstitutionalMonarchy();
	  
	@Query(value="select country.Name as Country_name, city.Name as City_name, city.District, city.Population from country\r\n"
			+ "join city on country.Code = city.CountryCode\r\n"
			+ "where Country.Name = 'Argentina' and city.Population > 500000 and city.District = 'Buenos Aires';", nativeQuery=true)
	List<Object[]> citiesOfArgentina();
	  
	@Query(value="select country.Region, count(country.Name) as number_of_countires from country\r\n"
			+ "GROUP BY country.Region\r\n"
			+ "ORDER BY number_of_countires DESC;", nativeQuery=true)
	List<Object[]> countriesEachRegion();
	  
}

