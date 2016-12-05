package com.vish.sfmovies.service;
import java.util.*;
import com.vish.sfmovies.entity.*;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findOne(String id);
	
	public Employee create(Employee emp);
	
	public Employee update(String id, Employee emp);
	
	public void delete(String id);
	
}
