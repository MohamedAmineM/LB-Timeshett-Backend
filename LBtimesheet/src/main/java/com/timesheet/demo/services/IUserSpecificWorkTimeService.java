package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.UserSpecificWorkTime;



public interface IUserSpecificWorkTimeService {
	
	UserSpecificWorkTime saveUserSpecificWorkTime(UserSpecificWorkTime userSpecificWorkTime);
	UserSpecificWorkTime updateUserSpecificWorkTime(UserSpecificWorkTime userSpecificWorkTime);
	void deleteUserSpecificWorkTime(UserSpecificWorkTime userSpecificWorkTime);
	void deleteUserSpecificWorkTimeById(Integer id);
	UserSpecificWorkTime getUserSpecificWorkTime(Integer id);
	List<UserSpecificWorkTime> getAllUserSpecificWorkTime();

}
