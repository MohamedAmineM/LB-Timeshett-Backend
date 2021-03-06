package com.timesheet.demo.model;





import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="jobTitle")
@Data
public class JobTitle {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idJobTitle;
	
	
	private String descriptionJobTitle;
	private String nameJobTitle;
	private boolean activeJobTitle; 
	
	
	
	
	
	
	
	
}
