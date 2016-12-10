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
import com.vish.sfmovies.service.EmployeeService;

@Controller
@ResponseBody
@RestController
@RequestMapping(path = "employees")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Employee> findAll() {		
		return service.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Employee findOne(@PathVariable("id") String empID) {		
		return service.findOne(empID);
	}
	
	@RequestMapping(method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Employee create(@RequestBody Employee emp) {		
		return service.create(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Employee update(@PathVariable("id") String empID, @RequestBody Employee emp) {		
		return service.update(empID, emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path = "{id}")
	public void delete(@PathVariable("id") String empID) {
		service.delete(empID);
	}
}
