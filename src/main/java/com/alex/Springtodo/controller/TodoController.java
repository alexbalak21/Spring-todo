package com.alex.Springtodo.controller;

import com.alex.Springtodo.model.Task;
import com.alex.Springtodo.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class TodoController {

    private final TaskRepository tasks;

    public TodoController(TaskRepository tasks){
        this.tasks = tasks;
    }

    @GetMapping("/")

    public Iterable<Task> tasks(){
        return tasks.findAll();
    }

    @PostMapping("/new")
    public Task post(@RequestBody Task postTask) {
        tasks.save(postTask);
        return postTask;
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id, @RequestBody Task putTask){
        if (tasks.findById(id).isEmpty()){
            return "No task";
        }
        else {
            Task updatedTask = new Task(id, putTask.getTitle(), putTask.isDone());
            tasks.save(updatedTask);
            return updatedTask.toString();
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        if (tasks.findById(id).isEmpty()){
            return "No task";
        }
        else
        tasks.deleteById(id);
        return "deleted";
    }
    }




