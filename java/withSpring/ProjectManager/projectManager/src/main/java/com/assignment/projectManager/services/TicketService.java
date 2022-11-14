package com.assignment.projectManager.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.projectManager.models.Ticket;
import com.assignment.projectManager.repositories.TicketRepository;



@Service
public class TicketService {
	private final TicketRepository ticketRepository;
	
	public TicketService(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}
	
	public List<Ticket> allTickets(){
		return ticketRepository.findAll();
	}
	
	public List<Ticket> projectTickets(Long projectId){
		return ticketRepository.findByProjectTicketIdIs(projectId);
	}
	
	public Ticket addTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	
	public void deleteTask(Ticket ticket) {
		ticketRepository.delete(ticket);
	}
}
