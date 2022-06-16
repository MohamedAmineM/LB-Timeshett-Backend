package com.timesheet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.Profile;
import com.timesheet.demo.repostitories.IProfileRepository;
@Service
public class ProfileService implements IProfileService {

	@Autowired
	IProfileRepository repository;
	
	@Override
	public Profile saveProfile(Profile profile) {
		return repository.save(profile);
	}

	@Override
	public Profile updateProfile(Profile profile) {
		return repository.save(profile);
	}

	@Override
	public void deleteProfile(Profile Profile) {
		repository.delete(Profile);
	}

	@Override
	public void deleteProfileById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Profile getProfile(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Profile> getAllProfile() {
		return repository.findAll();
	}

}
