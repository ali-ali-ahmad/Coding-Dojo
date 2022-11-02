package com.assignment.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String login(
		@RequestParam(value="number") String number,
	    @RequestParam(value="city") String city,
		@RequestParam(value="name") String name,
	    @RequestParam(value="hobby") String hobby,
		@RequestParam(value="thing") String thing,
	    @RequestParam(value="message") String message,
    	HttpSession session
		){
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("message", message);
	    	
	    return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
	    return "show.jsp";
	}
}
