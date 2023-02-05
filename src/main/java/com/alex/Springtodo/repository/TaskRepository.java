package com.alex.Springtodo.repository;

import com.alex.Springtodo.model.Task;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface TaskRepository extends CrudRepository<Task, Integer> {

    @Modifying
    @Query("UPDATE task SET done = :taskState WHERE id = :taskId")
    void updateState(int taskId, boolean taskState);
}

