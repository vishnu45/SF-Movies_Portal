package com.vish.sfmovies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name = "Movie.findAllByTitle", query = "SELECT mov FROM Movie mov ORDER BY title"),	
	@NamedQuery(name = "Movie.findAllByYear", query = "SELECT mov FROM Movie ORDER BY year"),
	@NamedQuery(name = "Movie.findAllByGenre", query = "SELECT mov FROM Movie mov ORDER BY genre"),
	@NamedQuery(name = "Movie.findByTitle", query = "SELECT mov FROM Movie mov WHERE mov.title =:mTitle")
})

public class Movie {

	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String id;
	
	@Column(unique=true)
	private String title;
	private String year;
	private String genre;
	
	@Column(unique=true)
	private String imdbID;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + "]";
	}
	
}
