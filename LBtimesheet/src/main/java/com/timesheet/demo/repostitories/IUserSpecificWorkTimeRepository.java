package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.UserSpecificWorkTime;

public interface IUserSpecificWorkTimeRepository extends JpaRepository<UserSpecificWorkTime, Integer> {

}
