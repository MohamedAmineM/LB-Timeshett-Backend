package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.Project;
import com.timesheet.demo.repostitories.IProjectRepository;

@Service
public class ProjectService implements IProjectService {

	@Autowired
	IProjectRepository repository;
	
	@Override
	public Project saveProject(Project project) {
		return repository.save(project);
	}

	@Override
	public Project updateProject(Project project) {
		return repository.save(project);
	}

	@Override
	public void deleteProject(Project project) {
		repository.delete(project);
	}

	@Override
	public void deleteProjectById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Project getProject(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Project> getAllProject() {
		return repository.findAll();
	}
	
	
	
	

}
