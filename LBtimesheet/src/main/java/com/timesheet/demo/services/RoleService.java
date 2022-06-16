package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.Role;
import com.timesheet.demo.repostitories.IRoleRepository;

@Service
public class RoleService implements IRoleService {

	
	@Autowired
	IRoleRepository repository;
	@Override
	public Role saveRole(Role role) {
		return repository.save(role);
	}

	@Override
	public Role updateRole(Role role) {
		return repository.save(role);
	}

	@Override
	public void deleteRole(Role role) {
		repository.delete(role);
	}

	@Override
	public void deleteRoleById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Role getRole(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Role> getAllRole() {
		return repository.findAll();
	}

}
