package com.vish.sfmovies.repository;
import java.util.*;
import com.vish.sfmovies.entity.*;

public interface EmployeeRepository {

	public List<Employee> findAll();
	
	public Employee findOne(String id);
	
	public Employee findByEmail(String id);
	
	public Employee create(Employee emp);
	
	public Employee update(Employee emp);
	
	public void delete(Employee emp);
}
