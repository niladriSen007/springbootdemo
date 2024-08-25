package com.example.springbootdemo.springbootdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Value("25")
    private int age;

//    @Autowired
//    ProgrammerFather programmerFather;

    private ComputerInterface computer;

    public int getAge() {
        return age;
    }

//    @Autowired

    public void setAge(int age) {
        this.age = age;
    }

    public ComputerInterface getComputer() {
        return computer;
    }

    @Autowired
    public void setComputer(ComputerInterface computer) {
        this.computer = computer;
    }


    public void code(){
//        programmerFather.compile();
        computer.compile();
        System.out.println("I am a Programmer, I love to code");
    }
}
