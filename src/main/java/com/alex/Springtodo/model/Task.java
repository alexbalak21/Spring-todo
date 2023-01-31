package com.alex.Springtodo.model;

import org.springframework.data.annotation.Id;

public class Task {
    @Id
    private Integer id;
    private String title;
    private boolean done;

    public Task(){
    }

    public Task(String title){
        this.title = title;
        this.done = false;
    }

    public Task(Integer id, String title, boolean done){
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", done=" + done +
                '}';
    }
}


