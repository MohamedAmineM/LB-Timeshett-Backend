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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Table(name="absences")
@Data
public class Absence {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAbsence;
	private int idEmployee;
	
	@Temporal(TemporalType.DATE)
	private Date absenceDate ;
	

	
	@Temporal(TemporalType.TIME)
	private Date startTimeAbsence;
	
	@Temporal(TemporalType.TIME)
	private Date endTimeAbsence;
	
	private float nbrDaysAbsence;
	private float nbrHoursAbsence;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEmployee", referencedColumnName = "idEmployee")
    private Employee employee;
	*/
	
	

}
