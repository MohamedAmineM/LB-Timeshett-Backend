package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timesheet.demo.model.leave;
import com.timesheet.demo.repostitories.ILeaveRepository;

@Service
public class LeaveService implements ILeaveService {

	@Autowired
	ILeaveRepository repository;

	

	

	@Override
	public leave saveleave(leave leave) {
		
		 return repository.save(leave);
	}

	@Override
	public leave updateLeave(leave leave) {
		
		 return repository.save(leave);
	}

	@Override
	public void deleteLeaves(leave leave) {
		
		repository.delete(leave);
		
	}

	@Override
	public void deleteleaveById(Integer id) {
		
		repository.deleteById(id);
		
	}

	@Override
	public leave getleave(Integer id) {
		
		 return repository.findById(id).get();
	}

	@Override
	public List<leave> getAllLeaves() {
		
		return repository.findAll();
	}
	

}
