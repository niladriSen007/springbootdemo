package com.example.springbootdemo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProgrammerFather {
    @Autowired
    CodeEditor vsCode;
    public void compile(){
        vsCode.writeGoodCode();
        System.out.println("Father is compiling code");
    }
}
