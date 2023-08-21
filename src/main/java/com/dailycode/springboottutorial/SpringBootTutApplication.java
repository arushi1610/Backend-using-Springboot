package com.dailycode.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.dailycode.springboottutorial" ,"controller"})
public class SpringBootTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutApplication.class, args);
	}

}
 