package com.alex.Springtodo.controller;

import com.alex.Springtodo.model.Task;
import com.alex.Springtodo.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {
    @RequestMapping("/")
    public String home(){
        return "Home";
    }


    private final TaskRepository tasks;

    public TodoController(TaskRepository tasks){
        this.tasks = tasks;
    }

    @GetMapping("/tasks")
    public Iterable<Task> tasks(){
        return tasks.findAll();
    }

    @PostMapping("/new")
    public String post(@RequestBody Task postTask){
        tasks.save(postTask);
        return postTask.toString();
        }
}
