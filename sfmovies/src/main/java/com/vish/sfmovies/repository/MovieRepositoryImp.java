package com.vish.sfmovies.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.vish.sfmovies.entity.Movie;

@Repository
public class MovieRepositoryImp implements MovieRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Movie> findAllByYear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findAllByGenre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie create(Movie mov) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie update(Movie mov) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie delete(Movie mov) {
		// TODO Auto-generated method stub
		return null;
	}

}
