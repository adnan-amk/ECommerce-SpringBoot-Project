package com.adnan.ecommerce.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController(){
        System.out.println("Hello Controller Called");
    }
    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello Method Called");
        return "Hello Adnan";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String helloUser(){
        System.out.println("HelloUser method Called");
        return "Hello User";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin(){
        System.out.println("HelloAdmin method Called");
        return "Hello Admin";
    }
}
