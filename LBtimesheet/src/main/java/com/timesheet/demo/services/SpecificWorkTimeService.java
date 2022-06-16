package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.SpecificWorkTime;
import com.timesheet.demo.repostitories.ISpecificWorkTime;
@Service
public class SpecificWorkTimeService implements ISpecificWorkTimeService {

	
	@Autowired
	ISpecificWorkTime repository;
	@Override
	public SpecificWorkTime saveSpecificWorkTime(SpecificWorkTime specificWorkTime) {
		return repository.save(specificWorkTime);
	}

	@Override
	public SpecificWorkTime updateSpecificWorkTime(SpecificWorkTime specificWorkTime) {
		return repository.save(specificWorkTime);
	}

	@Override
	public void deleteSpecificWorkTime(SpecificWorkTime specificWorkTime) {
		repository.delete(specificWorkTime);
	}

	@Override
	public void deleteSpecificWorkTimeById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public SpecificWorkTime getSpecificWorkTime(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<SpecificWorkTime> getAllSpecificWorkTime() {
		return repository.findAll();
	}

}
