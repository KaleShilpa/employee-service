package com.javaexpress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javaexpress.bean.Employee;
import com.javaexpress.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

}
