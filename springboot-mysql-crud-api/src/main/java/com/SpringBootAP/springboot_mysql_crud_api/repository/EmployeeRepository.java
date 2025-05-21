package com.SpringBootAP.springboot_mysql_crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAP.springboot_mysql_crud_api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
