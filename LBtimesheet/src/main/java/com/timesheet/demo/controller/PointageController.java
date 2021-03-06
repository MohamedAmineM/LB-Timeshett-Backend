package com.timesheet.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.lang.model.element.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.Pointage;
import com.timesheet.demo.model.Salaire;
import com.timesheet.demo.services.IPointageService;

@RestController
@RequestMapping("/pointages")
@CrossOrigin
public class PointageController {
	
	@Autowired
	IPointageService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Pointage> getAllPointage()
	{
		return service.getAllPointage();
	}
	
	@RequestMapping(value="/pointage/{id}",method = RequestMethod.GET)
	public Pointage getPointageById(@PathVariable("id") Integer id)
	{
		return service.getPointage(id);
	}
	
	@RequestMapping(value="/pointage/test",method = RequestMethod.GET)
	public List<Pointage> employeePointagePerDay()
	
	{
		
		List<Pointage>listPointages=new ArrayList<>();
		service.employeePointagePerDay().forEach(element->{
			Pointage pointageEmployee =new Pointage();
			//pointageEmployee.setIdPointage(element.getIdPointage());
			pointageEmployee.setIdPointageEmployee(element.getIdPointageEmployee());
			pointageEmployee.setPointageDate(element.getPointageDate());
			pointageEmployee.setStartTimePointage(element.getStartTimePointage());
			pointageEmployee.setEndTimePointage(element.getEndTimePointage());
			pointageEmployee.setOutTimePointage(element.getOutTimePointage());
			pointageEmployee.setTotalTimePointage(element.getTotalTimePointage());
			listPointages.add(pointageEmployee);
		});
		
		//System.out.println(listPointages);
		
		//service.savePointage(listPointages.get(0));
		//System.out.println(listPointages.get(0));
		for(int i=0;i<listPointages.size();i++) {
			System.out.println(listPointages.get(i));
			service.savePointage(listPointages.get(i));
		}
		
		
		return service.employeePointagePerDay();
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Pointage createPointage(@RequestBody Pointage pointage)
	{
			return service.savePointage(pointage);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Pointage updatePointage(@RequestBody Pointage pointage) 
	{
		return service.updatePointage(pointage);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletePointage(@PathVariable("id") Integer id)
	{
			 service.deletePointageById(id);
	}
	
	

}
