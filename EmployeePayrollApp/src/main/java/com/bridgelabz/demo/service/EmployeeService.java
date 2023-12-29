package com.bridgelabz.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.demo.dto.EmployeeDTO;
import com.bridgelabz.demo.model.Employee;
import com.bridgelabz.demo.repository.IEmployeeRepository;
@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
	IEmployeeRepository employeeRepo;
	@Override
	public Employee addEmployee(EmployeeDTO employeeDTO) {
	
		Employee employee =new Employee();
		employee.setName(employeeDTO.getName());
		employee.setSalary(employeeDTO.getSalary());
		
		return employeeRepo.save(employee);
	}


}
