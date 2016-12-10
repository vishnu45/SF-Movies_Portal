package com.vish.sfmovies.repository;
import java.util.*;
import com.vish.sfmovies.entity.*;

public interface UserRepository {	
	
	public UserDetails findOne(String id);
			
	public UserDetails create(UserDetails user);
	
	public UserDetails update(UserDetails user);
	
	public void delete(UserDetails user);
}
