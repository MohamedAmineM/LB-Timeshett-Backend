package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.Employee;

public interface IEmployeeService {
	/*
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployeeById(Integer id);
	Employee getEmployee(Integer id);
	List<Employee> getAllEmployee();
	*/
	
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	void deleteEmployeeById(Integer id);
	Employee getEmployee(Integer id);
	List<Employee> getAllEmployee();
	
	List<Employee> findByNameEmployee(String name);
	
	
	
	
	
	
	
	
}
