package com.luv2code.springboot.demo.mycoolapp.service;

import com.luv2code.springboot.demo.mycoolapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
