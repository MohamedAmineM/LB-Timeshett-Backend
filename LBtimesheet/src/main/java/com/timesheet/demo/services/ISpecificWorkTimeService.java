package com.timesheet.demo.services;

import java.util.List;


import com.timesheet.demo.model.SpecificWorkTime;

public interface ISpecificWorkTimeService {
	
	SpecificWorkTime saveSpecificWorkTime(SpecificWorkTime specificWorkTime);
	SpecificWorkTime updateSpecificWorkTime(SpecificWorkTime specificWorkTime);
	void deleteSpecificWorkTime(SpecificWorkTime specificWorkTime);
	void deleteSpecificWorkTimeById(Integer id);
	SpecificWorkTime getSpecificWorkTime(Integer id);
	List<SpecificWorkTime> getAllSpecificWorkTime();

}
