package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }


    @GetMapping("/hello")
    public String hello(){
        return "Hello World2";
    }
    
}
