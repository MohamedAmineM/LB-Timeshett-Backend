package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.UserSpecificWorkTime;
import com.timesheet.demo.repostitories.IUserSpecificWorkTimeRepository;
@Service
public class UserSpecificWorkTimeService implements IUserSpecificWorkTimeService {

	
	@Autowired
	IUserSpecificWorkTimeRepository repository;
	@Override
	public UserSpecificWorkTime saveUserSpecificWorkTime(UserSpecificWorkTime userSpecificWorkTime) {
		return repository.save(userSpecificWorkTime);
	}

	@Override
	public UserSpecificWorkTime updateUserSpecificWorkTime(UserSpecificWorkTime userSpecificWorkTime) {
		return repository.save(userSpecificWorkTime);
	}

	@Override
	public void deleteUserSpecificWorkTime(UserSpecificWorkTime userSpecificWorkTime) {
		repository.delete(userSpecificWorkTime);
	}

	@Override
	public void deleteUserSpecificWorkTimeById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public UserSpecificWorkTime getUserSpecificWorkTime(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<UserSpecificWorkTime> getAllUserSpecificWorkTime() {
		return repository.findAll();
	}

}
