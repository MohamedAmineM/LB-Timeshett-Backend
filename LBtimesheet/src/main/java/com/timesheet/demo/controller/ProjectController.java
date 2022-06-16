package com.timesheet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.demo.model.Project;
import com.timesheet.demo.model.Team;
import com.timesheet.demo.repostitories.IProjectRepository;
import com.timesheet.demo.repostitories.ITeamRepository;
import com.timesheet.demo.services.IProjectService;
import com.timesheet.demo.services.ITeamService;

@RestController
@RequestMapping("/projects")
@CrossOrigin
public class ProjectController {
	
	@Autowired
	IProjectService service;
	@Autowired
	IProjectRepository projectRepository;
	@Autowired
	ITeamRepository teamRepository;
	
	
	@Autowired
	ITeamService teamService;

	@RequestMapping(method=RequestMethod.GET)
	public List<Project> getAllProject()
	{
		return service.getAllProject();
	}
	
	@RequestMapping(value="/project/{id}",method = RequestMethod.GET)
	public Project getProjectById(@PathVariable("id") Integer id)
	{
		return service.getProject(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Project createProject(@RequestBody Project project)
	{
			return service.saveProject(project);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Project updateProject(@RequestBody Project project) 
	{
		return service.updateProject(project);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProject(@PathVariable("id") Integer id)
	{
			 service.deleteProjectById(id);
	}
	
	/*
	 @PutMapping("/{idProject}/teams/{idTeam}")
	    Project addTeamToProject(
	            @PathVariable Integer idProject,
	            @PathVariable Integer idTeam
	    ) {
	        Project project = projectRepository.findById(idProject).get();
	        Team team = teamRepository.findById(idTeam).get();
	        project.teams.add(team);
	        return projectRepository.save(project);
	    }
*/
	

}
