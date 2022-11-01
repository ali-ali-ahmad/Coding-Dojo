package com.assignment.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer counter = (Integer) session.getAttribute("count");
		if (counter == null || counter == 0) {
			counter = 1;
		}
		else {
			counter +=1;
		}

        session.setAttribute("count", counter);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model){
		Integer counter = (Integer) session.getAttribute("count");
		counter +=2;
		model.addAttribute("count", counter);
	    	
	    return "counter.jsp";
	}
	

}
