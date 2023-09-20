package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * example
 */
@RestController
public class example {

    @RequestMapping("/")
    public String helloworld() {
        return "Hello World";
    }
    @RequestMapping("/asd")
    public String helloworld2() {
        return "Hello World111111111";
    }
}