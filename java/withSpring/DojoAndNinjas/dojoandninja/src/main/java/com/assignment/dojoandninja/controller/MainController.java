package com.assignment.dojoandninja.controller;



import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.dojoandninja.models.Dojo;
import com.assignment.dojoandninja.models.Ninja;
import com.assignment.dojoandninja.services.DojoService;
import com.assignment.dojoandninja.services.NinjaService;



@Controller
public class MainController {
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	 
	 
	@GetMapping("/")
	public String index(
			@ModelAttribute("dojo") Dojo dojo,
			@ModelAttribute("ninja") Ninja ninja,
			Model model) {
     List<Dojo> dojos = dojoService.allDojos();
     model.addAttribute("dojos", dojos);
	    return "index.jsp";
	}
	
	@PostMapping("/newDojo")
	public String create_dojo(
		@Valid @ModelAttribute("dojo") Dojo dojo,
		BindingResult result) throws SQLException {
        if (result.hasErrors()) {
    	    return "index.jsp";
        } else {
        	dojoService.createDojo(dojo);
            return "redirect:/";
        }
	    
	}
	
	@PostMapping("/newNinja")
	public String create_ninja(
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result) throws SQLException {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/show/{id}")
	public String show(
			Model model,
			@ModelAttribute("dojo") Dojo dojo, 
			@ModelAttribute("ninja") Ninja ninja,
			@PathVariable("id") Long id
			) {
     model.addAttribute("dojos", dojoService.findDojo(id));
	    return "show.jsp";
	}

	   @GetMapping("/editDojo/{id}")
	   public String editDojo(@PathVariable("id") Long id, Model model) {
		   Dojo dojo = dojoService.findDojo(id);
	       model.addAttribute("dojo", dojo);
	       return "editdojo.jsp";
	   }
	   
	   @PutMapping("/updateDojo/{id}")
	   public String updateDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
				BindingResult result,
				@ModelAttribute("id") Long id,
				@RequestParam(value="name") String name)
				throws SQLException {
	       if (result.hasErrors())  {
	           return "editdojo.jsp";
	       } else {
	    	   dojoService.updateDojo(id, name);
	           return "redirect:/show/{id}";
	       }
	   }
	   
	   @GetMapping("/editNinja/{id}")
	   public String editNinja(@PathVariable("id") Long id, Model model) {
		   Ninja ninja = ninjaService.findNinja(id);
		   List<Dojo> dojos = dojoService.allDojos();
		     model.addAttribute("dojos", dojos);
		   model.addAttribute("ninja", ninja);
		   return "editninja.jsp";
	   }


		
	   @PutMapping("/updateNinja/{id}")
	   public String updateNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
			   BindingResult result,
			   @ModelAttribute("id") Long id,
			   @RequestParam(value="firstName") String firstName,
			   @RequestParam(value="lastName") String lastName,
			   @RequestParam(value="age") Integer age,
			   @RequestParam(value="dojo") Dojo dojo
			   ) throws SQLException {
		   if (result.hasErrors())  {
			   return "editninja.jsp";
		   } else {
			   ninjaService.updateNinja(id, firstName, lastName, age, dojo);
			   return "redirect:/show/{id}";
		   }
	   }
   
   @PutMapping("/{id}/edit")
   public String update(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result,
			@ModelAttribute("id") Long id,
			@RequestParam(value="name") String name)
			throws SQLException {
       if (result.hasErrors())  {
           return "edit.jsp";
       } else {
    	   dojoService.updateDojo(id, name);
           return "redirect:/{id}";
       }
   }
   
   
   @DeleteMapping("/deleteDojo/{id}")
   public String destroyDojo(@Valid @PathVariable("id") Long id) {
	   dojoService.deleteDojo(id);
       return "redirect:/";
   }
   
   @DeleteMapping("/deleteNinja/{id}")
   public String destroyNinja(@Valid @PathVariable("id") Long id) {
	   ninjaService.deleteNinja(id);
	   return "redirect:/show/{id}";
   }
   
	
}


