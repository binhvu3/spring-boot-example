package com.bv.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class MyFirstClass {

    public String sayHello(){
        return "Hello from first class!";
    }
}
