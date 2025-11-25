package com.bv.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(ExampleApplication.class, args);

        MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);

        System.out.println(myFirstClass.sayHello());
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
