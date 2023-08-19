package com.nicolasf.learningspringtodoapp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;


public class Todo {
    private int id;
    private String user;
    @Size(min = 10, message = "Enter at least 10 characters")
    private String desc;
    private boolean done;
    private LocalDate targetDate;

    public Todo(int id, String user, String desc, boolean done, LocalDate targetDate) {
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.done = done;
        this.targetDate = targetDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        done = done;
    }
    public LocalDate getTargetDate() {
        return targetDate;
    }
    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", isDone=" + done +
                ", targetDate=" + targetDate +
                '}';
    }
}

