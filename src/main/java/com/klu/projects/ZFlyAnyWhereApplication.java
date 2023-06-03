package com.klu.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klu.projects")
public class ZFlyAnyWhereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZFlyAnyWhereApplication.class, args);
		System.out.println("hello");
	}

}
