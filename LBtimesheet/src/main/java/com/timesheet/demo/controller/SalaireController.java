package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.timesheet.demo.model.Salaire;
import com.timesheet.demo.services.ISalaireService;

@RestController
@RequestMapping("/salaires")
@CrossOrigin

public class SalaireController {
	
	@Autowired
	ISalaireService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Salaire> getAllSalaire()
	{
		return service.getAllSalaire();
	}
	
	@RequestMapping(value="/salaire/{id}",method = RequestMethod.GET)
	public Salaire getSalaireById(@PathVariable("id") Integer id)
	{
		return service.getSalaire(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Salaire createSalaire(@RequestBody Salaire salaire)
	{
			return service.saveSalaire(salaire);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Salaire updateSalaire(@RequestBody Salaire salaire) 
	{
		return service.updateSalaire(salaire);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteSalaire(@PathVariable("id") Integer id)
	{
			 service.deleteSalaireById(id);
	}
	
	

}
