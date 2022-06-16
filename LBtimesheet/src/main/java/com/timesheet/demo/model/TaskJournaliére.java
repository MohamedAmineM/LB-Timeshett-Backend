package com.timesheet.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Table(name="taskjournaliere")
@Data
public class TaskJournaliére {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTask;
	private int idEmployee;
	private int idProjet;
	private int idTeam;
	private Date dateTask;
	private String descriptionTask;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEmployee", referencedColumnName = "idEmployee")
    private Employee employee;
	*/
}
