package com.timesheet.demo.repostitories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.timesheet.demo.model.DétailsPointage;

public interface IDétailsPointageRepository  extends JpaRepository<DétailsPointage, Integer>{
	
	List<DétailsPointage> findByIdPointageEmployeeAndPointageDateOrderByTimePointageAsc(Integer idPointageEmployee ,Date pointageDate);
	public List<DétailsPointage> findAllByOrderByIdAsc();
	
	DétailsPointage findByIdPointageEmployee(Integer idPointageEmployee);

}
