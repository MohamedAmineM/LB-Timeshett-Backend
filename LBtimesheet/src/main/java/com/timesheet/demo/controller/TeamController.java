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
import com.timesheet.demo.services.ITeamService;

@RestController
@RequestMapping("/teams")
@CrossOrigin
public class TeamController {

	@Autowired
	ITeamService service;
	
	@Autowired
	ITeamRepository teamRepository;
	
	@Autowired
	IProjectRepository projectRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Team> getAllTeam()
	{
		return service.getAllTeam();
	}
	
	@RequestMapping(value="/team/{id}",method = RequestMethod.GET)
	public Team getTeamById(@PathVariable("id") Integer id)
	{
		return service.getTeam(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Team createTeam(@RequestBody Team team)
	{
			return service.saveTeam(team);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Team updateTeam(@RequestBody Team team) 
	{
		return service.updateTeam(team);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteTeam(@PathVariable("id") Integer id)
	{
			 service.deleteTeamById(id);
	}
	
	
	@PutMapping("/{idTeam}/projects/{idProject}")
    Team addProjectToTeam(
            @PathVariable Integer idTeam,
            @PathVariable Integer idProject
    ) {
		Team team = teamRepository.findById(idTeam).get();
        Project project = projectRepository.findById(idProject).get();
        team.projects.add(project);
        return teamRepository.save(team);
    }

}
