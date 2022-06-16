package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.Salaire;
import com.timesheet.demo.repostitories.ISalaireRepository;

@Service
public class SalaireService implements ISalaireService {

	@Autowired
	ISalaireRepository repository;
	
	@Override
	public Salaire saveSalaire(Salaire salaire) {
		return repository.save(salaire);
	}

	@Override
	public Salaire updateSalaire(Salaire salaire) {
		return repository.save(salaire);
	}

	@Override
	public void deleteSalaire(Salaire salaire) {
		repository.delete(salaire);
	}

	@Override
	public void deleteSalaireById(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Salaire getSalaire(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Salaire> getAllSalaire() {
		return repository.findAll();
	}

}
