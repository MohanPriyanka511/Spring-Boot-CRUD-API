package com.SpringBootAP.springboot_mysql_crud_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringBootAP.springboot_mysql_crud_api.entity.Employee;
import com.SpringBootAP.springboot_mysql_crud_api.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeservice;

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeservice.getAllEmployees();
    }

    // Create a new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeservice.createEmployee(employee);
    }


    // Get employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) throws Throwable {
        return (Employee) employeeservice.getEmployeeById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }
    
 // Update an existing employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        return employeeservice.updateEmployee(id, updatedEmployee);
    }
    
 // Delete an employee by ID
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeservice.deleteEmployee(id);
        return "Employee deleted with id: " + id;
    }

}
