package com.example.alex.repository;

import com.example.alex.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository <Task, Integer> {
}
