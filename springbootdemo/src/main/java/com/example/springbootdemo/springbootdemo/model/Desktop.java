package com.example.springbootdemo.springbootdemo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements ComputerInterface{
    @Override
    public void compile() {
        System.out.println("Desktop is compiling");
    }
}
