package com.javaexpress.service;

import java.util.List;

import com.javaexpress.bean.Employee;


public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee getEmployeeById(Long id);
}
