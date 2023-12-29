package com.bridgelabz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.demo.dto.EmployeeDTO;
import com.bridgelabz.demo.model.Employee;
import com.bridgelabz.demo.response.Response;
import com.bridgelabz.demo.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	IEmployeeService employeeService;
    @PostMapping("/addEmployee")
   public ResponseEntity<Response> addEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
        Employee employee=	employeeService.addEmployee(employeeDTO);     
        return new ResponseEntity<Response>(new Response(employee ,"Employee Added"),HttpStatus.OK);
	}
    
    
    
//	@GetMapping("/getAllEmployee")
//    public String getEmployee()
//    {
//    	return "hello";
//    }
//	@GetMapping("/getEmployeeById/{id}")
//	public String getEmployeeById(@PathParam("id") int id)
//	{
//		return "by";
//	}
//	@PostMapping("/updateEmployee")
//	public String updateEmployee(@RequestBody EmployeeDTO employeeDTO)
//	{
//		return "mssg";
//	}
    
    
}
