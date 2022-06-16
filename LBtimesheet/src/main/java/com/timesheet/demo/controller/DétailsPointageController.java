package com.timesheet.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.DétailsPointage;
import com.timesheet.demo.repostitories.IDétailsPointageRepository;


@RestController
@CrossOrigin
public class DétailsPointageController {
	
	
	
	@Autowired
	IDétailsPointageRepository repositoryDetailsPointage;

	@RequestMapping(value="/test",method=RequestMethod.GET)
		public List<DétailsPointage> getAllDetailsPointage()
		{
		
	
		
		
			return repositoryDetailsPointage.findByIdPointageEmployeeAndPointageDateOrderByTimePointageAsc(1029,new Date(1459465200000L));
		}
	
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public List<DétailsPointage> getDetailsPointage()
	{
		
		//System.out.println(new Date(1459465200000L));
		return repositoryDetailsPointage.findAllByOrderByIdAsc();
	}

	
	

}
