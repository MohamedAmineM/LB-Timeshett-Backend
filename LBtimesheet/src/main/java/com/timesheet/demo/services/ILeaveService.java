package com.timesheet.demo.services;

import java.util.List;


import com.timesheet.demo.model.leave;

public interface ILeaveService {
	
	leave saveleave(leave leave);
	leave updateLeave(leave leave);
	void deleteLeaves(leave leave);
	void deleteleaveById(Integer id);
	leave getleave(Integer id);
	List<leave> getAllLeaves();

}
