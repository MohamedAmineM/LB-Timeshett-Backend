package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.DayParams;



public interface IDayParamsService {
	
	DayParams saveDayParams(DayParams dayParams);
	DayParams updateDayParams(DayParams dayParams);
	void deleteDayParams(DayParams dayParams);
	void deleteDayParamsById(Integer id);
	DayParams getDayParams(Integer id);
	List<DayParams> getAllDayParams();

}
