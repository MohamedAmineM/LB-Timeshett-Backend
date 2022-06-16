package com.timesheet.demo.model;

import java.io.Serializable;
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
@Table(name="leaves")
@Data
public class leave implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLeave;
	private int idEmployee;
	
	
	@Temporal(TemporalType.DATE)
	private Date leaveDate;
	
	@Temporal(TemporalType.TIME)
	private Date leaveStartTime;
	@Temporal(TemporalType.TIME)
	private Date leaveEndTime;
	private float leaveNbrDays;
	private float leaveNbrHours;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEmployee", referencedColumnName = "idEmployee")
    private Employee employee;
	 */

	


	public leave() {
		super();
		
	}





	
	
	
	

}
