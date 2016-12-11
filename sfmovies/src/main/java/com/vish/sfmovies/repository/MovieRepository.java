package com.vish.sfmovies.repository;

import java.util.List;
import com.vish.sfmovies.entity.Movie;

public interface MovieRepository {
	
	public List<Movie> findAllByYear();
	
	public List<Movie> findAllByGenre();
	
	public Movie findByTitle(String title);
	
	public Movie create(Movie mov);
	
	public Movie update(Movie mov);
	
	public Movie delete(Movie mov);
	

}
