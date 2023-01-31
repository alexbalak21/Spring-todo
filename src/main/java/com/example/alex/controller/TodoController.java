package com.example.alex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @RequestMapping("/")
    public String home(){
        return "Home";
    }
    @GetMapping("/{id}")
    public String getOne(){
        return "Return Todo";
    }
}
