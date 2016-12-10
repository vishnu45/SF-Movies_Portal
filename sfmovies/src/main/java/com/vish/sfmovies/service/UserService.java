package com.vish.sfmovies.service;
import com.vish.sfmovies.entity.*;

public interface UserService {

	public UserDetails findOne(String id);
	
	public UserDetails create(UserDetails user);
	
	public UserDetails update(String id, UserDetails uUserDetails);
	
	public void delete(String id);
	
	// user authorization
	
	// user sign in
	
	// user logout
	
}
