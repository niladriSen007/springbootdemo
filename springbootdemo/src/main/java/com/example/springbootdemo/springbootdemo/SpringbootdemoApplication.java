package com.example.springbootdemo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		Programmer programmer = context.getBean(Programmer.class);
		programmer.code();
		System.out.println("Hello World");
	}

}
