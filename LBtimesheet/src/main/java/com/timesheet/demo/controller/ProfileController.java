package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.timesheet.demo.model.Profile;
import com.timesheet.demo.services.IProfileService;

@RestController
@RequestMapping("/profiles")
@CrossOrigin
public class ProfileController {
	
	@Autowired
	IProfileService service;

	@RequestMapping(method=RequestMethod.GET)
	public List<Profile> getAllProfile()
	{
		return service.getAllProfile();
	}
	
	@RequestMapping(value="/profile/{id}",method = RequestMethod.GET)
	public Profile getProfileById(@PathVariable("id") Integer id)
	{
		return service.getProfile(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Profile createProfile(@RequestBody Profile profile)
	{
			return service.saveProfile(profile);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Profile updateProfile(@RequestBody Profile profile) 
	{
		return service.updateProfile(profile);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProfile(@PathVariable("id") Integer id)
	{
			 service.deleteProfileById(id);
	}

}
