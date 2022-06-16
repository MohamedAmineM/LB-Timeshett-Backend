package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.Team;

public interface ITeamService {
	
	Team saveTeam(Team team);
	Team updateTeam(Team team);
	void deleteTeam(Team team);
	void deleteTeamById(Integer id);
	Team getTeam(Integer id);
	List<Team> getAllTeam();

}
