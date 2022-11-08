package com.assignment.dojoandninja.services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment.dojoandninja.models.Dojo;
import com.assignment.dojoandninja.models.Ninja;
import com.assignment.dojoandninja.repositories.NinjaRepository;



@Service
public class NinjaService {

	private final NinjaRepository ninjaRepository;
    
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja b) {
        return ninjaRepository.save(b);
    }

    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    
	public Ninja updateNinja(Long id, String firstName, String lastName, Integer age, Dojo dojo) {
		Ninja ninja = findNinja(id);
	     if(ninja.getId()==id) {
	    	 ninja.setFirstName(firstName);
	    	 ninja.setLastName(lastName);
	    	 ninja.setAge(age);
	    	 ninja.setDojo(dojo);
	    	 return createNinja(ninja);
	     }
	     else {
	    	 return null;
	     }
	}
	
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}
}


