package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.JobTitle;
import com.timesheet.demo.repostitories.IJobTitleRepository;

@Service
public class JobTitleService implements IJobTitleService{

	@Autowired
	IJobTitleRepository repository;	
		
	@Override
	public JobTitle saveJobTitle(JobTitle jobTitle) {
		return repository.save(jobTitle);
	}

	@Override
	public JobTitle updateJobTitle(JobTitle jobTitle) {
		return repository.save(jobTitle);
	}

	@Override
	public void deleteJobTitle(JobTitle jobTitle) {
		repository.delete(jobTitle);
		
	}

	@Override
	public void deleteJobTitleById(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public JobTitle getJobTitle(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<JobTitle> getAllJobTitle() {
		return repository.findAll();
	}
	
	

}
