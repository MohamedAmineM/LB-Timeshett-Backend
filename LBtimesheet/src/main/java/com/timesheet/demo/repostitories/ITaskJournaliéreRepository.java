package com.timesheet.demo.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.demo.model.TaskJournaliére;

public interface ITaskJournaliéreRepository extends JpaRepository<TaskJournaliére, Integer>{

}
