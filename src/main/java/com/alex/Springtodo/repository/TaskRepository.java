package com.alex.Springtodo.repository;

import com.alex.Springtodo.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}