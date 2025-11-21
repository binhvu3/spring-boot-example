package com.bv.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyFirstClass {

    public String sayHello(){
        return "Hello from first class!";
    }
}
