package com.example.firstProject;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HomeController {
	
    @RequestMapping("/")
    public String index(){
    	return "Please, write travel then the city <<<< OR >>>> lotto and an number";
    }

    @RequestMapping("/log/{action}/{city}")
    public String travel(@PathVariable("action") String action, @PathVariable("city") String city){
    	if (action == "travel") {
    		return "Congratulations! You will soon travel to " + city + "!'.";
    	}
		else {
	    	return "This is a random generator for: " + action + city;
		}
    }
    
    @RequestMapping("/daikichi/{action}/{number}")
    public String luck(@PathVariable("action") String action, @PathVariable("number") int number){

		if (action == "lotto") {
			if (number %2 == 0) {
	    		return "'You will take a grand journey in the near future, but be weary of tempting offers'.";
			}
			else {
	    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
		}
		else {
	    	return "This is a random generator for: " + action + number;
		}

    }
}
