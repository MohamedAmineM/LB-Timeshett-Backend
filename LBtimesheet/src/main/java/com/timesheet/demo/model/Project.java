package com.timesheet.demo.model;


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import javax.persistence.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Entity
@Table(name="project")

public class Project {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProject;
	
	private int idTeamLead;
	private String nameProject;
	private String nameTeamLead;
	private Date startDateProject;
	private Date durationProject;
	
	
	
	
	
	@JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private Set<Team> teams = new HashSet<>();
	
	/*
	@ManyToMany
	@JoinTable(
	  name = "team_project", 
	  joinColumns = @JoinColumn(name = "idProject"), 
	  inverseJoinColumns = @JoinColumn(name = "idTeam"))
	@JsonIgnore
	private List<Team> teams;
	*/
	
	@JsonIgnore
	@ManyToMany(mappedBy = "projects")
	List<Employee> employees;
	
	/*
	@ManyToMany(mappedBy = "projects")
	List<Team> teams;
	*/

	/*
	@ManyToMany
	@JoinTable(
	  name = "project_team", 
	  joinColumns = @JoinColumn(name = "idTeam"), 
	  inverseJoinColumns = @JoinColumn(name = "idProject"))	
	private List<Team> teams;
	*/
	
	
	  

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	
	


	public int getIdTeamLead() {
		return idTeamLead;
	}

	public void setIdTeamLead(int idTeamLead) {
		this.idTeamLead = idTeamLead;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	
	

	public String getNameTeamLead() {
		return nameTeamLead;
	}

	public void setNameTeamLead(String nameTeamLead) {
		this.nameTeamLead = nameTeamLead;
	}

	public Date getStartDateProject() {
		return startDateProject;
	}

	public void setStartDateProject(Date startDateProject) {
		this.startDateProject = startDateProject;
	}

	public Date getDurationProject() {
		return durationProject;
	}

	public void setDurationProject(Date durationProject) {
		this.durationProject = durationProject;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
		
		
	}

	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", idTeamLead=" + idTeamLead + ", nameProject=" + nameProject
				+ ", nameTeamLead=" + nameTeamLead + ", startDateProject=" + startDateProject + ", durationProject="
				+ durationProject + ", teams=" + teams + ", employees=" + employees + "]";
	}

	
	  
	  
	  
	  
	  
	  
	
	
	
}
