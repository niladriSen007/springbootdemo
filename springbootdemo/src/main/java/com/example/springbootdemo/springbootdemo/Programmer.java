package com.example.springbootdemo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Programmer {

    @Autowired
    ProgrammerFather programmerFather;
    public void code(){
        programmerFather.compile();
        System.out.println("I am a Programmer, I love to code");
    }
}
