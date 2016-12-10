package com.vish.sfmovies.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.vish.sfmovies.entity.Movie;
import com.vish.sfmovies.repository.EmployeeRepository;

public class MovieServiceImp implements MovieService {

	@Autowired 
	MovieRepository mRepository;
	
	@Autowired 
	EmployeeRepository uRepository;
	
	// *************************** IMPLEMENTATION REMAINING
	@Override
	public List<Movie> findAllByYear(String mYear) {
		// TODO Auto-generated method stub
		return null;
	}

	// *************************** IMPLEMENTATION REMAINING
	@Override
	public List<Movie> findAllByGenre(String mGenre) {
		// TODO Auto-generated method stub
		return null;
	}

	// *************************** IMPLEMENTATION REMAINING
	@Override
	public Movie findByTitle(String mTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	// *************************** IMPLEMENTATION REMAINING
	@Override
	public Movie findById(String mId) {
		// TODO Auto-generated method stub
		return null;
	}

	// *************************** IMPLEMENTATION REMAINING
	@Override
	public Movie create() {
		// TODO Auto-generated method stub
		return null;
	}

	// *************************** IMPLEMENTATION REMAINING
	@Override
	public Movie update() {
		// TODO Auto-generated method stub
		return null;
	}

	// *************************** IMPLEMENTATION REMAINING
	@Override
	public Movie delete() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
