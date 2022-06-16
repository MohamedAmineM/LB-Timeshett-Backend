package com.timesheet.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Entity
@Table(name="detailsPointage")
@Data
public class DétailsPointage {
	
	
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Integer idPointageEmployee;
	private String nameEmployee;
	private String job;
	
	@Temporal(TemporalType.DATE)
	private Date pointageDate;
	
	@Temporal(TemporalType.TIME)
	private Date timePointage;
	
	private Integer typePointage; 
	
}
