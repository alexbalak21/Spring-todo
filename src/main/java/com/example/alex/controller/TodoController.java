package com.example.alex.controller;

import com.example.alex.model.Task;
import com.example.alex.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/new")
    CommandLineRunner commandLineRunner(TaskRepository taskRepo, @RequestBody Task taskReq){
        return args -> {
            Task task = new Task("Test", false);
            taskRepo.save(task);
        };
        };
}
