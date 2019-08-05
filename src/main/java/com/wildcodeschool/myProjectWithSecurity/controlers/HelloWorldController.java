package com.wildcodeschool.myProjectWithSecurity.controlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String admin() {
    return "Avengers... Assemble";
    }

    @GetMapping("/secret-base")
    public List <String> director(ArrayList<Integer> list) {
       ArrayList <String> school = new ArrayList <String>();
       school.add("Reims");
       school.add("Berlin");
       school.add("La Loupe");
       school.add("Lille");
       school.add("Lyon");


    return school;
    }
}