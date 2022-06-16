package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.TaskJournaliére;
import com.timesheet.demo.services.ITaskJournaliéreService;

@RestController
@RequestMapping("/taskJournaliéres")
@CrossOrigin
public class TaskJournaliéreController {
	
	@Autowired
	ITaskJournaliéreService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<TaskJournaliére> getAllTaskJournaliére()
	{
		return service.getAllTaskJournaliére();
	}
	
	@RequestMapping(value="/taskJournaliére/{id}",method = RequestMethod.GET)
	public TaskJournaliére getTaskJournaliéreById(@PathVariable("id") Integer id)
	{
		return service.getTaskJournaliére(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public TaskJournaliére createPointage(@RequestBody TaskJournaliére taskJournaliére)
	{
			return service.saveTaskJournaliére(taskJournaliére);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public TaskJournaliére updateTaskJournaliére(@RequestBody TaskJournaliére taskJournaliére) 
	{
		return service.updateTaskJournaliére(taskJournaliére);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteTaskJournaliére(@PathVariable("id") Integer id)
	{
			 service.deleteTaskJournaliéreById(id);
	}


}
