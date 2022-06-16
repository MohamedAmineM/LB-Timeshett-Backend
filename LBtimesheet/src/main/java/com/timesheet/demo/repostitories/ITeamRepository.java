package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Team;

public interface ITeamRepository extends JpaRepository<Team, Integer>{

}
