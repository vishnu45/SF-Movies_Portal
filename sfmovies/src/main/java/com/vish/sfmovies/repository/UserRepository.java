package com.vish.sfmovies.repository;
import java.util.*;
import com.vish.sfmovies.entity.*;

public interface UserRepository {	
	
	public UserDetails findOne(String id);
			
	public UserDetails create(UserDetails uUserDetails);
	
	public UserDetails update(UserDetails uUserDetails);
	
	public void delete(UserDetails uUserDetails);
}
