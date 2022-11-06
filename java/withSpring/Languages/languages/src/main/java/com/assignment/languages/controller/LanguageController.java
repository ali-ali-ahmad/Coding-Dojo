package com.assignment.languages.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.languages.models.Language;
import com.assignment.languages.services.LanguageService;

@Controller
public class LanguageController {

	 private final LanguageService languageService;
	 public LanguageController(LanguageService languageService){
	     this.languageService = languageService;
	 }
	 
	 
	@GetMapping("/")
	public String index(@ModelAttribute("language") Language language, Model model) {
     List<Language> languages = languageService.allLanguages();
     model.addAttribute("languages", languages);
	    return "index.jsp";
	}
	
	@PostMapping("/new")
	public String create(
			@Valid @ModelAttribute("language") Language language,
			BindingResult result) throws SQLException {
	        if (result.hasErrors()) {
	    	    return "index.jsp";
	        } else {
	        	languageService.createLanguage(language);
	            return "redirect:/";
	        }
	    
	}

	
   @GetMapping("/{id}")
   public String edit(@PathVariable("id") Long id, Model model) {
	   Language language = languageService.findLanguage(id);
       model.addAttribute("language", language);
       return "edit.jsp";
   }
   
   @PutMapping("/{id}/edit")
   public String update(@Valid @ModelAttribute("language") Language language,
			BindingResult result,
			@ModelAttribute("id") Long id,
			@RequestParam(value="name") String name,
			@RequestParam(value="creator") String creator,
			@RequestParam(value="version") Double version)
			throws SQLException {
       if (result.hasErrors())  {
           return "edit.jsp";
       } else {
    	   languageService.updateLanguage(id, name, creator, version);
           return "redirect:/{id}";
       }
   }
   
   
   @DeleteMapping("/delete/{id}")
   public String destroy(@Valid @PathVariable("id") Long id) {
	   languageService.deleteLanguage(id);
       return "redirect:/";
   }
   

	 @RequestMapping("/show/{id}")
	 public String show(@PathVariable("id") Long id, Model model) throws IOException {
		 Language language = languageService.findLanguage(id);
	     if(language.getName() != null) {
	    	 model.addAttribute("name", language.getName());
	    	 model.addAttribute("creator", language.getCreator());
	    	 model.addAttribute("version", language.getVersion());
	     }
	     return "show.jsp";
	 }
}
