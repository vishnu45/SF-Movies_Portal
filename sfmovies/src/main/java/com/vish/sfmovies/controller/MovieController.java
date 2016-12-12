package com.vish.sfmovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vish.sfmovies.entity.Movie;
import com.vish.sfmovies.service.MovieService;

@RestController
@RequestMapping(path = "Movies")
public class MovieController {

	@Autowired
	MovieService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "sortbyYear", produces = MediaType.APPLICATION_JSON_UTF8_VALUE) 
	public List<Movie> findAllByYear(@RequestHeader(value="Authorization") String authHeader) {
		return service.findAllByYear(authHeader);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "sortbyGenre", produces = MediaType.APPLICATION_JSON_UTF8_VALUE) 
	public List<Movie> findAllByGenre(@RequestHeader(value="Authorization") String authHeader) {
		return service.findAllByGenre(authHeader);
	} 
	
	@RequestMapping(method = RequestMethod.GET, path = "/title/{title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE) 
	public Movie findbyTitle(@PathVariable("title") String title) {
		return service.findByTitle(title);
	}
	
}
