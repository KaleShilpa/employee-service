package com.javaexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaexpress.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
