package com.sekhar.socialauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class demo {
    @GetMapping
    public String hello(){
        return "You have successfully accessed api";
    }
}
