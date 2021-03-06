package com.timesheet.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import lombok.Data;




@Entity
@Table(name="employees")

public class Employee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEmployee;
	
	
	private Integer idJobTitle;
	private Integer idPointageEmployee;
	private Integer cinEmployee;
	private String phoneEmployee;
	private String emailEmployee;
	private String nameEmployee;
	private Date date_embaucheEmployee;
	private String password;
	private boolean activeEmployee;
	
	
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEmployee")
    private List<Salaire> salaires = new ArrayList<>();
	
	 
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEmployee")
    private List<leave> leaves = new ArrayList<>();
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEmployee")
    private List<Absence> absences = new ArrayList<>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPointageEmployee")
    private List<Pointage> pointages = new ArrayList<>();
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEmployee")
    private List<SpecificWorkTime> specificWorkTimes = new ArrayList<>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEmployee")
    private List<TaskJournaliére> taskJournaliéres = new ArrayList<>();
	
	
	
	
	/*
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	  name = "team_employee", 
	  joinColumns = @JoinColumn(name = "idTeam"), 
	  inverseJoinColumns = @JoinColumn(name = "idEmployee"))
	private List<Team> teams;

	
	@OneToOne(fetch = FetchType.LAZY)
	private Profile profile;
	*/
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	  name = "project_employee", 
	  joinColumns = @JoinColumn(name = "idEmployee"), 
	  inverseJoinColumns = @JoinColumn(name = "idProject"))
	private List<Project> projects;
	
	

	@OneToOne
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Profile profile;
	
	@OneToOne
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private JobTitle jobTitle;
	
	
	
    
	public Employee() {}

	
	public Employee(String username, String email, String encode) {
		// TODO Auto-generated constructor stub
		this.nameEmployee=username;
		this.emailEmployee=email;
		this.password=encode;
		
		
	}


	public Integer getIdEmployee() {
		return idEmployee;
	}


	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}


	public Integer getIdJobTitle() {
		return idJobTitle;
	}


	public void setIdJobTitle(Integer idJobTitle) {
		this.idJobTitle = idJobTitle;
	}


	public Integer getCinEmployee() {
		return cinEmployee;
	}


	public void setCinEmployee(Integer cinEmployee) {
		this.cinEmployee = cinEmployee;
	}


	public String getPhoneEmployee() {
		return phoneEmployee;
	}


	public void setPhoneEmployee(String phoneEmployee) {
		this.phoneEmployee = phoneEmployee;
	}


	public String getEmailEmployee() {
		return emailEmployee;
	}


	public void setEmailEmployee(String emailEmployee) {
		this.emailEmployee = emailEmployee;
	}


	public String getNameEmployee() {
		return nameEmployee;
	}


	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}


	public Date getDate_embaucheEmployee() {
		return date_embaucheEmployee;
	}


	public void setDate_embaucheEmployee(Date date_embaucheEmployee) {
		this.date_embaucheEmployee = date_embaucheEmployee;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActiveEmployee() {
		return activeEmployee;
	}


	public void setActiveEmployee(boolean activeEmployee) {
		this.activeEmployee = activeEmployee;
	}


	public List<Salaire> getSalaires() {
		return salaires;
	}


	public void setSalaires(List<Salaire> salaires) {
		this.salaires = salaires;
	}


	public List<leave> getleaves() {
		return leaves;
	}


	public void setleaves(List<leave> leaves) {
		this.leaves = leaves;
	}


	public List<Absence> getAbsences() {
		return absences;
	}


	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}


	public List<Pointage> getPointages() {
		return pointages;
	}


	public void setPointages(List<Pointage> pointages) {
		this.pointages = pointages;
	}


	public List<SpecificWorkTime> getSpecificWorkTimes() {
		return specificWorkTimes;
	}


	public void setSpecificWorkTimes(List<SpecificWorkTime> specificWorkTimes) {
		this.specificWorkTimes = specificWorkTimes;
	}


	public List<TaskJournaliére> getTaskJournaliéres() {
		return taskJournaliéres;
	}


	public void setTaskJournaliéres(List<TaskJournaliére> taskJournaliéres) {
		this.taskJournaliéres = taskJournaliéres;
	}



	public JobTitle getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}


	public List<Project> getProjects() {
		return projects;
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	public Profile getProfile() {
		return profile;
	}


	public void setProfile(Profile profile) {
		this.profile = profile;
	}


	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", idJobTitle=" + idJobTitle + ", cinEmployee=" + cinEmployee
				+ ", phoneEmployee=" + phoneEmployee + ", emailEmployee=" + emailEmployee + ", nameEmployee="
				+ nameEmployee + ", date_embaucheEmployee=" + date_embaucheEmployee + ", password=" + password
				+ ", activeEmployee=" + activeEmployee + ", salaires=" + salaires + ", leaves=" + leaves + ", absences="
				+ absences + ", pointages=" + pointages + ", specificWorkTimes=" + specificWorkTimes
				+ ", taskJournaliéres=" + taskJournaliéres + ", projects=" + projects + ", profile=" + profile
				+ ", jobTitle=" + jobTitle + "]";
	}


	


	





	




	


	


	
	

}
