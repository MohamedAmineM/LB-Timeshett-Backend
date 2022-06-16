package com.timesheet.demo.model;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="salaires")
@Data
public class Salaire {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSalaire;
	private int idEmployee;
	private Double salaireSalaire;
	private Date dateSalaire;
	
	
	/* @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="idEmployee")
    private Employee employee;*/


	public Salaire() {}
	

   
	

}
