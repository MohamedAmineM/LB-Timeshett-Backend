package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.timesheet.demo.model.leave;
import com.timesheet.demo.services.ILeaveService;

@RestController
@RequestMapping("/leave")
@CrossOrigin
public class LeaveController {
	
	@Autowired
	ILeaveService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<leave> getAllLeaves()
	{
		return service.getAllLeaves();
	}
	
	@RequestMapping(value="/leave/{id}",method = RequestMethod.GET)
	public leave getleaveById(@PathVariable("id") Integer id)
	{
		return service.getleave(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public leave createCongés(@RequestBody leave leave)
	{
			return service.saveleave(leave);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public leave updateCongés(@RequestBody leave leave) 
	{
		return service.updateLeave(leave);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCongés(@PathVariable("id") Integer id)
	{
			 service.deleteleaveById(id);
	}


}
