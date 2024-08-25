package com.example.springbootdemo.springbootdemo;

import com.example.springbootdemo.springbootdemo.model.Laptop;
import com.example.springbootdemo.springbootdemo.model.Programmer;
import com.example.springbootdemo.springbootdemo.services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
//		Programmer programmer = context.getBean(Programmer.class);
//		programmer.code();
//		System.out.println(programmer.getAge());

		LaptopService laptopService = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addLaptop(laptop);
//		laptop.compile();
	}

}
