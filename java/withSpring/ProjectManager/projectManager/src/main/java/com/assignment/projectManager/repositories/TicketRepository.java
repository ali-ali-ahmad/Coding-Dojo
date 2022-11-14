package com.assignment.projectManager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.assignment.projectManager.models.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long>{
	
	List<Ticket> findAll();
	
	List<Ticket> findByProjectTicketIdIs(Long id);
	
//	List<Ticket> findByUserIdIs(Long userId);
	
//	List<Ticket> findByProjectTicketIdIs(Long userId);
	
//	List<Ticket> findByTeamMembersIdIsOrUserIdIs(Long teamMemberID, Long userId);
	
//	List<Ticket> findByProjectTicketContains(Project project);
	
	
	
}
