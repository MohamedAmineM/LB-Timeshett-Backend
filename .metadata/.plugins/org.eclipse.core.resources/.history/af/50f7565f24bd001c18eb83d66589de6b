package com.timesheet.demo.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ListenerCreateRule.OptionalListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timesheet.demo.model.Employee;
import com.timesheet.demo.repostitories.IEmployeeRepository;



@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository repository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> employ=repository.findByEmailEmployee(employee.getEmailEmployee());
		employee.setPassword(employ.get().getPassword());
		return repository.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		repository.delete(employee);
		
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Employee getEmployee(Integer id) {
		
		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public List<Employee> findByNameEmployee(String name) {
		
		return repository.findByNameEmployee(name);
	}

	

	

	
	

	

	
    
	
/*
	@Override
	public List<Employee> findBySalaireIdSalaire(Integer id) {
		
		return repository.findBySalaireIdSalaire(id);
	}
	*/

	


	

	
	
}
