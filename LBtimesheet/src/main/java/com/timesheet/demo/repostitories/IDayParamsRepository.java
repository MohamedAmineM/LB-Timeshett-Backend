package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.DayParams;

public interface IDayParamsRepository extends JpaRepository<DayParams, Integer>{

}
