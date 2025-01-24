package com.luv2code.springboot.demo.mycoolapp;

import com.luv2code.springboot.demo.mycoolapp.dao.AppDAO;
import com.luv2code.springboot.demo.mycoolapp.entity.Instructor;
import com.luv2code.springboot.demo.mycoolapp.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycoolappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycoolappApplication.class, args);
    }

    // Command Line App
    // commandLineRunner is executed after the spring beans have been loaded
    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
            createInstructor(appDAO);
        };
    }

    private void createInstructor(AppDAO appDAO) {

        /*
        // create the instructor
        Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@luv2code.com");

        // create the instructor detail
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Luv 2 code!!!");
         */

        // create the instructor
        Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhu@luv2code.com");

        // create the instructor detail
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Guitar");

        // associate the objects
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        // save the instructor
        //
        // NOTE: this will ALSO save the details object
        // because of CascadeType.ALL
        //
        System.out.println("Saving instructor: " + tempInstructor);
        appDAO.save(tempInstructor);

        System.out.println("Done!");
    }
}
