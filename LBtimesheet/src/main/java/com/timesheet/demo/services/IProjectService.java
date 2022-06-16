package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.Project;

public interface IProjectService {
	
	Project saveProject(Project project);
	Project updateProject(Project project);
	void deleteProject(Project project);
	void deleteProjectById(Integer id);
	Project getProject(Integer id);
	List<Project> getAllProject();

}
