package com.timesheet.demo.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="userSpecificWorkTime")
@Data
public class UserSpecificWorkTime {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUW;
	
	private int idEmployee;
	private int id_SW;
	private Date start_date;
	private Date end_date;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idUW")
    private List<SpecificWorkTime> specificWorkTimes = new ArrayList<>();
}
