package com.assignment.projectManager.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.projectManager.models.Project;
import com.assignment.projectManager.models.Ticket;
import com.assignment.projectManager.services.ProjectService;
import com.assignment.projectManager.services.TicketService;
import com.assignment.projectManager.services.UserService;




@Controller
public class ProjectController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TicketService ticketService;
	
	 
	@GetMapping("/projects")
	public String projects(HttpSession session, Model model) {
		
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			return "redirect:/logout";
		}
		Long userId1 = userService.findById(userId).getId();
		model.addAttribute("user", userService.findById(userId));
		model.addAttribute("userId", userId1);

        
		List<Project> projects = projectService.unteams(userService.findById(userId));
//		List<Project> projects = projectService.allProjects();
		model.addAttribute("projects", projects);

		List<Project> myProjects = projectService.teams(userService.findById(userId));
		model.addAttribute("myProjects", myProjects);
        
		
	    return "projects.jsp";
	    
	}
	 
	@RequestMapping("/show/{id}")
	public String showProject(@PathVariable("id") Long id, Model model,
			HttpSession session
			) throws IOException {
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			return "redirect:/logout";
		}
		model.addAttribute("user", userService.findById(userId));
	    

		model.addAttribute("tickets", ticketService.projectTickets(id));
		Project project = projectService.findProject(id);
		model.addAttribute("project", project);
	     return "show.jsp";
	 }
	 
	@GetMapping("/addProject")
	public String addProject(
			HttpSession session, 
			Model model,
			@ModelAttribute("project") Project project
			) {
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userService.findById(userId));
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
	    return "add.jsp";
	}
	
	@PostMapping("/newProject")
	public String createProject(
		@Valid @ModelAttribute("project") Project project,
		BindingResult result,
		HttpSession session
		) throws SQLException {
		
		Long userId = (Long) session.getAttribute("userId");
//		Long userId1 = userService.findById(userId).getId();
		if(userId == null) {
			return "redirect:/logout";
		}
		
        if (result.hasErrors()) {
    	    return "add.jsp";
        } else {
        	projectService.createProject(project, userService.findById(userId), result);
            return "redirect:/projects";
        }
	    
	}


    @GetMapping("/editProject/{id}")
    public String editProject(@PathVariable("id") Long id, Model model, HttpSession session) {
    	
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		Project project = projectService.findProject(id);
		model.addAttribute("project", project);
		return "edit.jsp";
    }
    
	@PutMapping("/updateProject/{id}")
	public String updateProject(
			@PathVariable("id") Long id,
			@Valid @ModelAttribute("project") Project project, 
			BindingResult result, 
			HttpSession session) {	
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		 
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			projectService.updateProject(project);
			return "redirect:/show/{id}";
		}
	}
    
    @DeleteMapping("/deleteProject/{id}")
    public String destroyProject(@Valid @PathVariable("id") Long id,
    		HttpSession session
    		) {
    	
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		projectService.deleteProject(id);
        return "redirect:/projects";
    }

	
	@RequestMapping("/teamIn/{projectID}")
	public String addTeamMember(@PathVariable("projectID") Long projectID, HttpSession session) {
	 
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			return "redirect:/logout";
		}
		projectService.addTeamMember(projectService.findProject(projectID), userService.findById(userId));
		 
		return "redirect:/projects";
	}
	
	@RequestMapping("/teamOut/{projectID}")
	public String removeTeamMember(@PathVariable("projectID") Long projectID, HttpSession session) {
	 
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		projectService.removeTeamMember(projectService.findProject(projectID));
		 
		return "redirect:/projects";
	}
	
	
	@GetMapping("/viewTickets/{id}")
	public String viewTickets(@PathVariable("id") Long id, HttpSession session, Model model, @ModelAttribute("ticket") Ticket ticket) {
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		Project project = projectService.findById(id);
		model.addAttribute("project", project);
		model.addAttribute("tickets", ticketService.projectTickets(id));
		return "ticket.jsp";
	}
	
	@PostMapping("/addTicket/{id}")
	public String newTicket(
			@PathVariable("id") Long id, 
			HttpSession session, 
			Model model, 
			@Valid @ModelAttribute("ticket") Ticket ticket, 
			BindingResult result,
			@RequestParam("task") String task
			) {
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		Long userId = (Long) session.getAttribute("userId");
		
		Project project = projectService.findById(id);
		
		if(result.hasErrors()) {
			model.addAttribute("project", project);
			model.addAttribute("tickets", ticketService.projectTickets(id));
			return "ticket.jsp";
		}else {
			Ticket newTicket = new Ticket();
			newTicket.setTask(task);
			newTicket.setProjectTicket(project);
			newTicket.setTicketMaker(userService.findById(userId));
			ticketService.addTicket(newTicket);
			return "redirect:/viewTickets/" + id;
		}
	}
	
	
    
}
