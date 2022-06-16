package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.Role;

public interface IRoleService {
	
	Role saveRole(Role role);
	Role updateRole(Role role);
	void deleteRole(Role role);
	void deleteRoleById(Integer id);
	Role getRole(Integer id);
	List<Role> getAllRole();

}
