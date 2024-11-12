package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Explicitly list base packages to scan
//@SpringBootApplication(
//		scanBasePackages = {"com/luv2code/springboot/demo/mycoolapp",
//							"com/luv2code/springboot/demo/mycoolapp/util"})

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
