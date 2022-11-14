package com.assignment.projectManager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.projectManager.models.Project;
import com.assignment.projectManager.models.User;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	List<Project> findAll();
	
	List<Project> findByUserIdIs(Long userId);
	
	List<Project> findByTeamMembersIdIs(Long userId);
	
	List<Project> findByTeamMembersIdIsOrUserIdIs(Long teamMemberID, Long userId);
	
	List<Project> findByTeamMembersNotContains(User user);
	
	
	
}
