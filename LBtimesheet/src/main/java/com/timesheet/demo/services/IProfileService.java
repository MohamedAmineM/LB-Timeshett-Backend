package com.timesheet.demo.services;

import java.util.List;

import com.timesheet.demo.model.Profile;

public interface IProfileService {
	
	Profile saveProfile(Profile profile);
	Profile updateProfile(Profile profile);
	void deleteProfile(Profile Profile);
	void deleteProfileById(Integer id);
	Profile getProfile(Integer id);
	List<Profile> getAllProfile();

}
