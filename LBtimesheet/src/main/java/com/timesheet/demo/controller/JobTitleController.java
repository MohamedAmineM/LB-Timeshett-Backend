package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.JobTitle;
import com.timesheet.demo.services.IJobTitleService;

@RestController
@RequestMapping("/jobTitles")
@CrossOrigin
public class JobTitleController {
	
	@Autowired
	IJobTitleService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<JobTitle> getAllJobTitle()
	{
		return service.getAllJobTitle();
	}
	
	@RequestMapping(value="/jobTitle/{id}",method = RequestMethod.GET)
	public JobTitle getJobTitleById(@PathVariable("id") Integer id)
	{
		return service.getJobTitle(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public JobTitle createJobTitle(@RequestBody JobTitle jobTitle)
	{
			return service.saveJobTitle(jobTitle);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public JobTitle updateJobTitle(@RequestBody JobTitle jobTitle) 
	{
		return service.updateJobTitle(jobTitle);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteJobTitle(@PathVariable("id") Integer id)
	{
			 service.deleteJobTitleById(id);
	}


}
