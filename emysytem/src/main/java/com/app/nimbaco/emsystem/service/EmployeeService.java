package com.app.nimbaco.emsystem.service;

import java.util.List;
import java.util.Optional;

import com.app.nimbaco.emsystem.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(Long employeeId);

	Employee createEmployee(Employee employee);	

	Employee updateEmployee(Employee employeeDetails);

	void deleteEmployee(Employee employee);
}
