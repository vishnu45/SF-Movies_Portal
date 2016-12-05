package com.vish.sfmovies.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vish.sfmovies.entity.Employee;
import com.vish.sfmovies.repository.EmployeeRepository;
import com.vish.sfmovies.exception.*;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> findAll() {		
		return repository.findAll();
	}

	@Override
	public Employee findOne(String id) {
		Employee existing = repository.findOne(id);
		if (existing == null) {
			throw new EmployeeAlreadyExistsException("Employee with id: " + id + " not found");
		}
		return existing;
	}

	@Override
	@Transactional
	public Employee create(Employee emp) {
		Employee existing = repository.findByEmail(emp.getEmail());
		if (existing != null) {
			throw new EmployeeNotFoundException("Employee with email: " + emp.getEmail() + " already exists");
		}
		return repository.create(emp);
	}

	@Override
	@Transactional
	public Employee update(String id, Employee emp) {
		Employee existing = repository.findOne(id);
		if (existing == null) {
			throw new EmployeeAlreadyExistsException("Employee with id: " + id + " not found");
		}
		return repository.update(emp);
	}

	@Override
	@Transactional
	public void delete(String id) {
		Employee existing = repository.findOne(id);
		if (existing == null) {
			throw new EmployeeAlreadyExistsException("Employee with id: " + id + " not found");
		}
		repository.delete(existing);
	}

	
	
}
