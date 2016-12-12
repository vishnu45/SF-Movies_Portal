package com.vish.sfmovies.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vish.sfmovies.entity.UserDetails;
import com.vish.sfmovies.repository.UserRepository;
import com.vish.sfmovies.exception.*;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepository repository;

	// ******************** implementation pending
	@Override
	public UserDetails findOne(String id) {
		UserDetails existing = repository.findOne(id);
		if (existing == null) {
			throw new UserAlreadyExistsException("User with id: " + id + " not found");
		}
		return existing;
	}

	// for creating a new user (sign up)
	@Override
	@Transactional
	public UserDetails create(UserDetails uUserDetails) {
		
		if (uUserDetails.getRole().equals("Admin")) {
			throw new UserNotFoundException("No admin allowed");			
		}
		
		else if (!uUserDetails.getRole().equals("User")) {
			throw new UserNotFoundException("Invalid role");			
		}
		
		UserDetails existing = repository.findOne(uUserDetails.getUserName());
		if (existing != null) {
			throw new UserNotFoundException("Employee with email: " + uUserDetails.getEmail() + " already exists");
		}
		return repository.create(uUserDetails);
	}

	// ******************** implementation pending
	@Override
	@Transactional
	public UserDetails update(String id, UserDetails emp) {		
		return repository.update(emp);
	}

	// ******************** implementation pending
	@Override
	@Transactional
	public void delete(String id) {
		UserDetails existing = repository.findOne(id);
		if (existing == null) {
			throw new UserAlreadyExistsException("Employee with id: " + id + " not found");
		}
		repository.delete(existing);
	}

	// user authorization
	
	// user sign in
		
	// user logout
	
}
