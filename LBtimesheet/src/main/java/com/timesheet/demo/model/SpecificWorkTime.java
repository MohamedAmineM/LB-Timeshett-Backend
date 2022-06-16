package com.timesheet.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="specificWorkTime")
@Data
public class SpecificWorkTime {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSpecWorkTime;
	private int idEmployee;
	private int idUW;
	private int idType;
	private String nameSpecWorkTime;
	private int firstWeekDay;
	private int secondWeekDay;
	private int thirdWeekDay;
	private int fourthWeekDay;
	private int fifthWeekDay;
	
    /*
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEmployee", referencedColumnName = "idEmployee")
    private Employee employee;
	*/
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUW", referencedColumnName = "idUW")
    private UserSpecificWorkTime userSpecificWorkTime;
	*/
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idSpecWorkTime")
    private List<DayParams> dayParams = new ArrayList<>();
	
}
