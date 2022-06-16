package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.leave;

public interface ILeaveRepository extends JpaRepository<leave, Integer>{

}
