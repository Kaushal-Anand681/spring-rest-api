package com.kanand.springRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanand.springRestAPI.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
