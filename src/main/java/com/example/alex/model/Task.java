package com.example.alex.model;

import org.springframework.data.annotation.Id;

public class Task {
    @Id
    private Integer id;
    private String title;
    private Boolean done;

    public Task(String title){
        this.title = title;
        this.done = false;
    }

    public  Task(String title, boolean done){
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

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
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
