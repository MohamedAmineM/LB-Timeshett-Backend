package com.timesheet.demo.model;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="dayparams")
@Data
public class DayParams {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idParam;
	private int idSpecWorkTime;
	private int nbrHoursDayParam;
	private String typeDayParams;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idSpecWorkTime", referencedColumnName = "idSpecWorkTime")
    private SpecificWorkTime specificWorkTime;
   */
	
	

}
