package com.example.springbootdemo.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements ComputerInterface{
    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }
}
