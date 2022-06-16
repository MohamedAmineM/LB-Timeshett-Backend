package com.timesheet.demo.services;

import java.util.Date;
import java.util.List;

import com.timesheet.demo.model.DétailsPointage;
import com.timesheet.demo.model.Pointage;


public interface IPointageService {
	
	
	Pointage savePointage(Pointage pointage);
	Pointage updatePointage(Pointage pointage);
	void deletePointage(Pointage pointage);
	void deletePointageById(Integer id);
	Pointage getPointage(Integer id);
	List<Pointage> getAllPointage();
	/*List<Pointage> getDetailsPointages();*/
	//List<Pointage> savePointagePerDay(List<Pointage> listPointagePerDay);
	
	//Pointage employeePointagePerDay(Integer idPointageEmployee ,Date pointageDate);
	
	List<Pointage> employeePointagePerDay();
	
}
