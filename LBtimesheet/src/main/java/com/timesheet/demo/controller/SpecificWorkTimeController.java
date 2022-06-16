package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.SpecificWorkTime;
import com.timesheet.demo.services.ISpecificWorkTimeService;

@RestController
@RequestMapping("/specificWorkTimes")
@CrossOrigin
public class SpecificWorkTimeController {
	
	@Autowired
	ISpecificWorkTimeService service;
	

	@RequestMapping(method=RequestMethod.GET)
	public List<SpecificWorkTime> getAllSpecificWorkTime()
	{
		return service.getAllSpecificWorkTime();
	}
	
	@RequestMapping(value="/specificWorkTime/{id}",method = RequestMethod.GET)
	public SpecificWorkTime getSpecificWorkTimeById(@PathVariable("id") Integer id)
	{
		return service.getSpecificWorkTime(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public SpecificWorkTime createSpecificWorkTime(@RequestBody SpecificWorkTime specificWorkTime)
	{
			return service.saveSpecificWorkTime(specificWorkTime);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public SpecificWorkTime updateSpecificWorkTime(@RequestBody SpecificWorkTime specificWorkTime) 
	{
		return service.updateSpecificWorkTime(specificWorkTime);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteSpecificWorkTime(@PathVariable("id") Integer id)
	{
			 service.deleteSpecificWorkTimeById(id);
	}
	

}
