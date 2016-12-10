package com.vish.sfmovies.service;

import java.util.*;
import com.vish.sfmovies.entity.*;

public interface MovieService {

	public List<Movie> findAllByYear(String mYear);
	
	public List<Movie> findAllByGenre(String mGenre);
	
	public Movie findByTitle(String mTitle);
	
	public Movie findById(String mId);
	
	public Movie create();
	
	public Movie update();
	
	public Movie delete();
	
}
