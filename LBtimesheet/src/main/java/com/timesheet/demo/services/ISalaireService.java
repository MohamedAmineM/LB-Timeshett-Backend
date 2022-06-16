package com.timesheet.demo.services;

import java.util.List;


import com.timesheet.demo.model.Salaire;

public interface ISalaireService {
	
	Salaire saveSalaire(Salaire salaire);
	Salaire updateSalaire(Salaire salaire);
	void deleteSalaire(Salaire salaire);
	void deleteSalaireById(Integer id);
	Salaire getSalaire(Integer id);
	List<Salaire> getAllSalaire();

}
