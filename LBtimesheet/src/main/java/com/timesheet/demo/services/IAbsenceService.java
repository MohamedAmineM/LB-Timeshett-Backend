package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.Absence;
import com.timesheet.demo.model.Pointage;


public interface IAbsenceService {
	
	Absence saveAbsence(Absence absence);
	Absence updateAbsence(Absence absence);
	void deleteAbsence(Absence absence);
	void deleteAbsenceById(Integer id);
	Absence getAbsence(Integer id);
	List<Absence> getAllAbsence();

	
}
