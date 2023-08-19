package com.nicolasf.learningspringtodoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "nicolas", "Learn Spring MVC", false, LocalDate.now().plusWeeks(2)));
        todos.add(new Todo(2, "nicolas", "Learn Struts", false, LocalDate.now().plusWeeks(1)));
        todos.add(new Todo(3, "nicolas", "Learn Hibernate", false, LocalDate.now().plusWeeks(3)));
        todos.add(new Todo(4, "nicolas", "Learn Spring Boot", false, LocalDate.now().plusWeeks(2)));
    }

    public List<Todo> findByUser(String user) {
        return todos;
    }
}
