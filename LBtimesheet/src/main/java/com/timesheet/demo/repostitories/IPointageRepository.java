package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Pointage;

public interface IPointageRepository extends JpaRepository<Pointage, Integer> {

}
