package com.luv2code.springboot.demo.mycoolapp.dao;

import com.luv2code.springboot.demo.mycoolapp.entity.Student;

// Step 1: Define DAO interface
public interface StudentDAO {
    void save(Student theStudent);
}
