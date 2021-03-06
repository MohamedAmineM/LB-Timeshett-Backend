package com.timesheet.demo.model;







import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="profile")
@Data

public class Profile {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProfile;
	
	private String nameProfile;
	private String descriptionProfile;
	private boolean activeProfile;
	
	/*
	@OneToOne(mappedBy="profile")
	private Employee employee;
	*/
	/*
	@ManyToMany(mappedBy = "profiles")
	@JsonIgnore
	List<Employee> employees;
	*/
	
	@ManyToMany
	@JoinTable(
	  name = "profile_role", 
	  joinColumns = @JoinColumn(name = "idProfile"), 
	  inverseJoinColumns = @JoinColumn(name = "idRole"))
	
	private List<Role> roles;
	
}
