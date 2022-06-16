package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.JobTitle;

public interface IJobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
