package com.example.springbootdemo.springbootdemo.services;

import com.example.springbootdemo.springbootdemo.model.Laptop;
import com.example.springbootdemo.springbootdemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop) {
        //Add laptop to the database
        laptopRepository.saveLaptop(laptop);
        System.out.println("Laptop has been added to the database successfully👦");
    }
}
