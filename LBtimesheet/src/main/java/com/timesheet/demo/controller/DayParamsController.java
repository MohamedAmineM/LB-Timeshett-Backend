package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.DayParams;
import com.timesheet.demo.services.IDayParamsService;

@RestController
@RequestMapping("/dayParams")
@CrossOrigin
public class DayParamsController {
	
	@Autowired
	IDayParamsService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<DayParams> getAllDayParams()
	{
		return service.getAllDayParams();
	}
	
	@RequestMapping(value="/dayParams/{id}",method = RequestMethod.GET)
	public DayParams getDayParamsById(@PathVariable("id") Integer id)
	{
		return service.getDayParams(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public DayParams createDayParams(@RequestBody DayParams dayParams)
	{
			return service.saveDayParams(dayParams);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public DayParams updateDayParams(@RequestBody DayParams dayParams) 
	{
		return service.updateDayParams(dayParams);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteDayParams(@PathVariable("id") Integer id)
	{
			 service.deleteDayParamsById(id);
	}
	
	

}
