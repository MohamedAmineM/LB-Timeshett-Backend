package com.timesheet.demo.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRole;
	
	private String nameRole;
	private int typeRole;
	private String lblName;
	private String lblTypeName;
	private boolean activeRole;
	
	
	@ManyToMany(mappedBy = "roles")
	@JsonIgnore
	List<Profile> profiles;
	

}
