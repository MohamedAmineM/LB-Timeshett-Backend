package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.SpecificWorkTime;

public interface ISpecificWorkTime extends JpaRepository<SpecificWorkTime, Integer>{

}
