package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.JobTitle;


public interface IJobTitleService {
	

	JobTitle saveJobTitle(JobTitle jobTitle);
	JobTitle updateJobTitle(JobTitle jobTitle);
	void deleteJobTitle(JobTitle jobTitle);
	void deleteJobTitleById(Integer id);
	JobTitle getJobTitle(Integer id);
	List<JobTitle> getAllJobTitle();

}
