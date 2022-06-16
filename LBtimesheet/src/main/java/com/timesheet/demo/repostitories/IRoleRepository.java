package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Integer>{

}
