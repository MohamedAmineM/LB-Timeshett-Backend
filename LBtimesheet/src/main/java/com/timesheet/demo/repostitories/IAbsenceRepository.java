package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Absence;

public interface IAbsenceRepository extends JpaRepository<Absence, Integer>  {

}
