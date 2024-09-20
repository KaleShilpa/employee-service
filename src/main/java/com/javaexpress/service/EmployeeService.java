package com.javaexpress.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaexpress.bean.Employee;


public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
}
