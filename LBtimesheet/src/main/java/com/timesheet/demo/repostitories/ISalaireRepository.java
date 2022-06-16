package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Salaire;

public interface ISalaireRepository extends JpaRepository<Salaire, Integer> {

}
