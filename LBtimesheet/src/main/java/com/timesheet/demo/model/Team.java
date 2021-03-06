package com.timesheet.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name="team")

public class Team {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTeam;
	


	private int idTeamLead;
	private String name;
	private String nameTeamLead;
	private String description_Team;
	private boolean active_Team;
	
	
	
	
	
	 @ManyToMany
	    @JoinTable(
	            name = "team_projects",
	            joinColumns = @JoinColumn(name = "id_Team"),
	            inverseJoinColumns = @JoinColumn(name = "id_Project")
	    )
	   public Set<Project> projects = new HashSet<>();
	
	/*
	@ManyToMany(mappedBy = "teams")
	@JsonIgnore
	List<Employee> employees;
	
	@ManyToMany(mappedBy = "teams")
	List<Project> projects;
	*/

	/*
	@ManyToMany
	@JoinTable(
	  name = "project_team", 
	  joinColumns = @JoinColumn(name = "idTeam"), 
	  inverseJoinColumns = @JoinColumn(name = "idProject"))
	@JsonIgnore
	private List<Project> projects;
*/
	
	@ManyToMany
	@JoinTable(
	  name = "team_employee", 
	  joinColumns = @JoinColumn(name = "idEmployee"), 
	  inverseJoinColumns = @JoinColumn(name = "idTeam"))
	private List<Employee> employees;
	
	/*
	@ManyToMany
	@JoinTable(
	name = "team_project", 
	  joinColumns = @JoinColumn(name = "idProject"), 
	  inverseJoinColumns = @JoinColumn(name = "idTeam"))
	private List<Project> projects;
*/
	
	

	
	
	
	
	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public String getNameTeamLead() {
		return nameTeamLead;
	}

	public void setNameTeamLead(String nameTeamLead) {
		this.nameTeamLead = nameTeamLead;
	}

	public String getDescription_Team() {
		return description_Team;
	}

	public void setDescription_Team(String description_Team) {
		this.description_Team = description_Team;
	}

	public boolean isActive_Team() {
		return active_Team;
	}

	public void setActive_Team(boolean active_Team) {
		this.active_Team = active_Team;
	}



	public int getIdTeamLead() {
		return idTeamLead;
	}

	public void setIdTeamLead(int idTeamLead) {
		this.idTeamLead = idTeamLead;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	 
	
	@Override
	public String toString() {
		return "Team [idTeam=" + idTeam + ", idTeamLead=" + idTeamLead + ", name=" + name + ", nameTeamLead="
				+ nameTeamLead + ", description_Team=" + description_Team + ", active_Team=" + active_Team
				+ ", projects=" + projects + ", employees=" + employees + "]";
	}
    
    
}
