package com.example.springbootdemo.springbootdemo.repository;

import com.example.springbootdemo.springbootdemo.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void saveLaptop(Laptop laptop) {
        System.out.println("I am adding laptop to the database");
    }
}
