package com.example.demoapp.demoapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {

    @GetMapping("/data")
    public String getTestData() {
        return "Hello, World!";
    }

    @GetMapping("/age/{id}")
    public String getCustSalary(@PathVariable int id){
        int salary = 0;
        if(id == 200){
            salary = 8;
        }
        if( id == 400){
            salary = 16;
        }
        return "CUST ID: " + id + " | SALARY: " + salary + "LPA";
    }


}
