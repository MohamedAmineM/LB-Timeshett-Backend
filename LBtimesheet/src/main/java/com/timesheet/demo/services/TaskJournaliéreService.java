package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.TaskJournaliére;
import com.timesheet.demo.repostitories.ITaskJournaliéreRepository;

@Service
public class TaskJournaliéreService implements ITaskJournaliéreService {

	
	@Autowired
	ITaskJournaliéreRepository repository;
	
	@Override
	public TaskJournaliére saveTaskJournaliére(TaskJournaliére taskJournaliére) {
		return repository.save(taskJournaliére);
	}

	@Override
	public TaskJournaliére updateTaskJournaliére(TaskJournaliére taskJournaliére) {
		return repository.save(taskJournaliére);
	}

	@Override
	public void deleteTaskJournaliére(TaskJournaliére taskJournaliére) {
		repository.delete(taskJournaliére);
	}

	@Override
	public void deleteTaskJournaliéreById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public TaskJournaliére getTaskJournaliére(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<TaskJournaliére> getAllTaskJournaliére() {
		return repository.findAll();
	}

}
