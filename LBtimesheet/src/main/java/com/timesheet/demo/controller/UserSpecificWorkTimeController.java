package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.UserSpecificWorkTime;
import com.timesheet.demo.services.IUserSpecificWorkTimeService;

@RestController
@RequestMapping("/userSpecificWorkTimes")
@CrossOrigin
public class UserSpecificWorkTimeController {
	
	@Autowired
	IUserSpecificWorkTimeService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<UserSpecificWorkTime> getAllUserSpecificWorkTime()
	{
		return service.getAllUserSpecificWorkTime();
	}
	
	@RequestMapping(value="/userSpecificWorkTime/{id}",method = RequestMethod.GET)
	public UserSpecificWorkTime getUserSpecificWorkTimeById(@PathVariable("id") Integer id)
	{
		return service.getUserSpecificWorkTime(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public UserSpecificWorkTime createUserSpecificWorkTime(@RequestBody UserSpecificWorkTime userSpecificWorkTime)
	{
			return service.saveUserSpecificWorkTime(userSpecificWorkTime);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public UserSpecificWorkTime updateUserSpecificWorkTime(@RequestBody UserSpecificWorkTime userSpecificWorkTime) 
	{
		return service.updateUserSpecificWorkTime(userSpecificWorkTime);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteUserSpecificWorkTime(@PathVariable("id") Integer id)
	{
			 service.deleteUserSpecificWorkTimeById(id);
	}


}
