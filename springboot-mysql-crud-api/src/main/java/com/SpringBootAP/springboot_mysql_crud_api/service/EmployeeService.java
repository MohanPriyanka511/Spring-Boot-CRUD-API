package com.SpringBootAP.springboot_mysql_crud_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootAP.springboot_mysql_crud_api.entity.Employee;
import com.SpringBootAP.springboot_mysql_crud_api.repository.EmployeeRepository;

// The service layer contains method that call the repository and manage business logic.
//
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Optional getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}
	
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
	    Employee existingEmployee = employeeRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

	    existingEmployee.setName(updatedEmployee.getName());
	    existingEmployee.setDept(updatedEmployee.getDept());

	    return employeeRepository.save(existingEmployee);
	}
	
	public void deleteEmployee(Long id) {
	    if (!employeeRepository.existsById(id)) {
	        throw new RuntimeException("Employee not found with id: " + id);
	    }
	    employeeRepository.deleteById(id);
	}


}
