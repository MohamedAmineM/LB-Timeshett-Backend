package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Project;

public interface IProjectRepository extends JpaRepository<Project,Integer> {

}
