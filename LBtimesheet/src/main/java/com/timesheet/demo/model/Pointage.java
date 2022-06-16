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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Table(name="pointage")
@Data
public class Pointage {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPointage;
	
	private int idPointageEmployee;
	
	@Temporal(TemporalType.DATE)
	private Date pointageDate;
	
	@Temporal(TemporalType.TIME)
	private Date startTimePointage;
	
	@Temporal(TemporalType.TIME)
	private Date endTimePointage;
	private long outTimePointage;
	private long totalTimePointage;
	
	/*
	@ManyToOne
    @JoinColumn(name = "idEmployee", referencedColumnName = "idEmployee")
    private Employee employee;
	*/
}
