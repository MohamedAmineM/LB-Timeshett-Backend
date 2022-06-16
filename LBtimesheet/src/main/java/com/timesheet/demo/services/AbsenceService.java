package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timesheet.demo.model.Absence;
import com.timesheet.demo.repostitories.IAbsenceRepository;
@Service
public class AbsenceService implements IAbsenceService {

	@Autowired
	IAbsenceRepository repository;

	@Override
	public Absence saveAbsence(Absence absence) {
		return repository.save(absence);
	}

	@Override
	public Absence updateAbsence(Absence absence) {
		return repository.save(absence);
	}

	@Override
	public void deleteAbsence(Absence absence) {
		repository.delete(absence);	
	}

	@Override
	public void deleteAbsenceById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Absence getAbsence(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Absence> getAllAbsence() {
		return repository.findAll();
	}

	


}
