package com.nicolasf.learningspringtodoapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
@Entity
public class Todo {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    @Size(min = 10, message = "Enter at least 10 characters")
    private String desc;
    private boolean done;
    private LocalDate targetDate;

    public Todo(int id, String username, String desc, boolean done, LocalDate targetDate) {
        this.id = id;
        this.username = username;
        this.desc = desc;
        this.done = done;
        this.targetDate = targetDate;
    }

    public Todo() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUser() {
        return username;
    }
    public void setUser(String username) {
        this.username = username;
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
        this.done = done;
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
                ", user='" + username + '\'' +
                ", desc='" + desc + '\'' +
                ", isDone=" + done +
                ", targetDate=" + targetDate +
                '}';
    }
}

