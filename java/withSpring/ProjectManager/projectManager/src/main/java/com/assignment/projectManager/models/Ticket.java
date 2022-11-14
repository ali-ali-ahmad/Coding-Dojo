package com.assignment.projectManager.models;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tickets")
public class Ticket {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
//    @NotEmpty(message="Task is required!")
    @Size(min = 3, max = 100, message="Title must be between 3 and 100 characters")
    private String task;
    
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="maker_id")
    private User ticketMaker;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="project_id")
    private Project projectTicket;
    
    
    public Ticket() {
    }
    
//    public Ticket(String task) {
//        this.task = task;
//
//    }
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getTicketMaker() {
		return ticketMaker;
	}

	public void setTicketMaker(User ticketMaker) {
		this.ticketMaker = ticketMaker;
	}

	public Project getProjectTicket() {
		return projectTicket;
	}

	public void setProjectTicket(Project projectTicket) {
		this.projectTicket = projectTicket;
	}
    
    
    
}
