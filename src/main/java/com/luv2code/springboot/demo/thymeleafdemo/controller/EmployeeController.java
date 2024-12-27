package com.luv2code.springboot.demo.thymeleafdemo.controller;

import com.luv2code.springboot.demo.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.demo.thymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;


    @Autowired // Since only one constructor @Autowired is optional
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"

    @GetMapping("/lists")
    public String listEmployees(Model theModel) {

        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}
