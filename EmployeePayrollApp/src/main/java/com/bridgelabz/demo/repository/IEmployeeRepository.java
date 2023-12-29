package com.bridgelabz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.demo.model.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{

}
