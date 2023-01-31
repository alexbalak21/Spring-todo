package com.alex.Springtodo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @RequestMapping("/")
    public String home(){
        return "Welcome Home.";
    }
}
