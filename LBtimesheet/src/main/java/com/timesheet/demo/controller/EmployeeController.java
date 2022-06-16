package com.timesheet.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.Employee;
import com.timesheet.demo.services.IEmployeeService;




@RestController
@RequestMapping("/employees")
@CrossOrigin

public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@RequestMapping(value="/employee/{id}",method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") Integer id)
	{
		return service.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee)
	{
		
			return service.saveEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) 
	{
		return service.updateEmployee(employee);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") Integer id)
	{
			 service.deleteEmployeeById(id);
	}
	
	@RequestMapping(value = "/{name}",method = RequestMethod.GET)
	public List<Employee>getEmployeeByName(@PathVariable String name)
	{
		return service.findByNameEmployee(name);
	}
	
	
	
	/*
	
	@RequestMapping(value="/employee/salaire/{idSalaire}",method = RequestMethod.GET)
	public List<Employee> getEmployeesByIdSalaire(@PathVariable("idSalaire") Integer idSalaire) {
		return service.findBySalaireIdSalaire(idSalaire);
	}
	
	*/
	
	
	

}
