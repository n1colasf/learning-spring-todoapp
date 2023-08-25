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
    private String description;
    private boolean isDone;
    private LocalDate targetDate;

    public Todo(int id, String username, String description, boolean isDone, LocalDate targetDate) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.isDone = isDone;
        this.targetDate = targetDate;
    }

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean getIsDone() {
        return isDone;
    }
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
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
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                ", targetDate=" + targetDate +
                '}';
    }
}

