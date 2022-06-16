package com.timesheet.demo.services;

import java.util.List;


import com.timesheet.demo.model.TaskJournaliére;

public interface ITaskJournaliéreService {
	
	TaskJournaliére saveTaskJournaliére(TaskJournaliére taskJournaliére);
	TaskJournaliére updateTaskJournaliére(TaskJournaliére taskJournaliére);
	void deleteTaskJournaliére(TaskJournaliére taskJournaliére);
	void deleteTaskJournaliéreById(Integer id);
	TaskJournaliére getTaskJournaliére(Integer id);
	List<TaskJournaliére> getAllTaskJournaliére();

}
