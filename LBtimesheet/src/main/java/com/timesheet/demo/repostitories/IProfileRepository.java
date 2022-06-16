package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Profile;

public interface IProfileRepository extends JpaRepository<Profile, Integer> {

}
