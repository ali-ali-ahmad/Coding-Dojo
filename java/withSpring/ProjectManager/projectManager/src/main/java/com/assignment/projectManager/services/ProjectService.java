package com.assignment.projectManager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.assignment.projectManager.models.Project;
import com.assignment.projectManager.models.User;
import com.assignment.projectManager.repositories.ProjectRepository;






@Service
public class ProjectService {

	private final ProjectRepository projectRepository;
	 
	 public ProjectService(ProjectRepository projectRepository) {
	     this.projectRepository = projectRepository;
	 }
	 

	 public List<Project> allProjects() {
	     return projectRepository.findAll();
	 }
	 

	public List<Project> unteams (User user){
		return projectRepository.findByTeamMembersNotContains(user);
	}
		
	public List<Project> teams(User user){
		return projectRepository.findByTeamMembersIdIs(user.getId());
	}
	
	public List<Project> myProjects(User user){
		return projectRepository.findByUserIdIs(user.getId());
	}
	 

	 public Project createProject(Project b, User user, BindingResult result) {
		b.getTeamMembers();
		user.getProjectTeams().add((Project) b);
		 return projectRepository.save(b);

	 }
	 
	 public Project updateProject(Project b) {
		return projectRepository.save(b);
	 }
	 

	 public Project findProject(Long id) {
	     Optional<Project> optionalProject = projectRepository.findById(id);
	     if(optionalProject.isPresent()) {
	         return optionalProject.get();
	     } else {
	         return null;
	     }
	 }
	 

	public void deleteProject(Long id) {
		projectRepository.deleteById(id);
	}
	
	
	public void removeTeamMember(Project project) {
		project.setTeamMembers(null);
		projectRepository.save(project);
	}
	
	public void addTeamMember(Project project, User user) {
		project.getTeamMembers().add((User) user);
		user.getProjectTeams();

		projectRepository.save(project);
	}
	
	public Project findById(Long id) {
		Optional<Project> optionalProject = projectRepository.findById(id);
		if(optionalProject.isPresent()) {
			return optionalProject.get();
		}else {
			return null;
		}
	}

}


