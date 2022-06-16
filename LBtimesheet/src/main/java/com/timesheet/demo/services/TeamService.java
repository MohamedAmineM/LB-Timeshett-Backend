package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.Team;
import com.timesheet.demo.repostitories.ITeamRepository;
@Service
public class TeamService implements ITeamService {

	@Autowired
	ITeamRepository repository;
	
	@Override
	public Team saveTeam(Team team) {
		return repository.save(team);
	}

	@Override
	public Team updateTeam(Team team) {
		//System.out.println(team.toString());
		return repository.save(team);
	}

	@Override
	public void deleteTeam(Team team) {
		repository.delete(team);
	}

	@Override
	public void deleteTeamById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Team getTeam(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Team> getAllTeam() {
		return repository.findAll();
	}

}
