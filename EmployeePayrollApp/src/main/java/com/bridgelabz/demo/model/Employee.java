package com.bridgelabz.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Id
	private int EmpId;
    private String name;
    private Long salary;
}
