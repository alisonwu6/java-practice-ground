package com.luv2code.springboot.demo.mycoolapp.model;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        System.out.println("getCountry");
        return country;
    }

    public void setCountry(String country) {
        System.out.println("setCountry");
        this.country = country;
    }
}
