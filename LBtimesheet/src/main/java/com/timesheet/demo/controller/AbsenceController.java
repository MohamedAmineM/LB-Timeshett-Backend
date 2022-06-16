package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.timesheet.demo.model.Absence;
import com.timesheet.demo.services.IAbsenceService;

@RestController
@RequestMapping("/absences")
@CrossOrigin
public class AbsenceController {
	
	@Autowired
	IAbsenceService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Absence> getAllAbsence()
	{
		return service.getAllAbsence();
	}
	
	@RequestMapping(value="/absence/{id}",method = RequestMethod.GET)
	public Absence getAbsenceById(@PathVariable("id") Integer id)
	{
		return service.getAbsence(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Absence createAbsence(@RequestBody Absence absence)
	{
			return service.saveAbsence(absence);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Absence updateAbsence(@RequestBody Absence absence) 
	{
		return service.updateAbsence(absence);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteAbsence(@PathVariable("id") Integer id)
	{
			 service.deleteAbsenceById(id);
	}

}
