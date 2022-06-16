package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.DayParams;
import com.timesheet.demo.repostitories.IDayParamsRepository;

@Service
public class DayParamsService implements IDayParamsService {

	
	@Autowired
	IDayParamsRepository repository;
	
	@Override
	public DayParams saveDayParams(DayParams dayParams) {
		return repository.save(dayParams);
	}

	@Override
	public DayParams updateDayParams(DayParams dayParams) {
		return repository.save(dayParams);
	}

	@Override
	public void deleteDayParams(DayParams dayParams) {
		repository.delete(dayParams);
	}

	@Override
	public void deleteDayParamsById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public DayParams getDayParams(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<DayParams> getAllDayParams() {
		return repository.findAll();
	}

}
