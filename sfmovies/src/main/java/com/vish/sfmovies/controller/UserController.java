package com.vish.sfmovies.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vish.sfmovies.entity.*;
import com.vish.sfmovies.service.UserService;

@Controller
@ResponseBody
@RestController
@RequestMapping(path = "UserDetails")
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(method=RequestMethod.GET, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserDetails findOne(@PathVariable("id") String userId) {		
		return service.findOne(userId);
	}
	
	@RequestMapping(method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserDetails create(@RequestBody UserDetails usr) {		
		return service.create(usr);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserDetails update(@PathVariable("id") String userId, @RequestBody UserDetails usr) {		
		return service.update(userId, usr);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path = "{id}")
	public void delete(@PathVariable("id") String userId) {
		service.delete(userId);
	}
}
