package com.luv2code.springboot.demo.mycoolapp.dao;

import com.luv2code.springboot.demo.mycoolapp.entity.Student;

import java.util.List;
// Step 1: Define DAO interface
public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
}
