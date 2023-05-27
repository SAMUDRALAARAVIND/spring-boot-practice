package com.employeeservice.demo.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class User {
        private String name ;
        private String password;
        private String email ;
    }


    @GetMapping("/")
    public String homePage() {
        return "Google cloud practice page" ;
    }

    @GetMapping("/user")
    public User getUser() {
        return new User("aravind samudrala", "abc@123", "samudralaaravind1708@gmai.com");
    }
}
