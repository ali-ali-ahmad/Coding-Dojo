package com.assignment.projectManager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects")
public class Project {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message="Title is required!")
    @Size(min = 3, max = 100, message="Title must be between 3 and 100 characters")
    private String title;
    
    @NotEmpty(message="description is required!")
    @Size(min = 3, max = 100, message="Description must be between 3 and 100 characters")
    private String description;
    
    @Future(message="date should be in the future!")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dueDate;
    
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="leader_id")
    private User user;
    
    @Column(updatable=false)
    @OneToMany(mappedBy="projectTicket", fetch = FetchType.LAZY)
    private List<Ticket> Tickets;
    
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "projects_teams", 
        joinColumns = @JoinColumn(name = "project_id"), 
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> teamMembers;
    
    public Project() {
    }
    
    public Project(Long id, String title, String description, Date dueDate, User user, List<User> teamMembers) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.user = user;
        this.teamMembers.add((User) user);



    }
    
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<User> teamMembers) {
		this.teamMembers = teamMembers;
	}


    
	
}