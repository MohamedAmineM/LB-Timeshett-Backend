package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.Role;
import com.timesheet.demo.services.IRoleService;

@RestController
@RequestMapping("/roles")
@CrossOrigin
public class RoleController {
	
	@Autowired
	IRoleService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Role> getAllRole()
	{
		return service.getAllRole();
	}
	
	
	@RequestMapping(value="/role/{id}",method = RequestMethod.GET)
	public Role getRoleById(@PathVariable("id") Integer id)
	{
		return service.getRole(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Role createRole(@RequestBody Role role)
	{
			return service.saveRole(role);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Role updateRole(@RequestBody Role role) 
	{
		return service.updateRole(role);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteRole(@PathVariable("id") Integer id)
	{
			 service.deleteRoleById(id);
	}

}
