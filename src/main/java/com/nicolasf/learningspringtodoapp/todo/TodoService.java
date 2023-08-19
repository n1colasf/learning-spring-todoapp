package com.nicolasf.learningspringtodoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;
    static {
        todos.add(new Todo(++todoCount, "nicolas", "Learn Spring MVC", false, LocalDate.now().plusWeeks(2)));
        todos.add(new Todo(++todoCount, "nicolas", "Learn Struts", false, LocalDate.now().plusWeeks(1)));
        todos.add(new Todo(++todoCount, "nicolas", "Learn Hibernate", false, LocalDate.now().plusWeeks(3)));
        todos.add(new Todo(++todoCount, "nicolas", "Learn Spring Boot", false, LocalDate.now().plusWeeks(2)));
    }

    public List<Todo> findByUser(String user) {
        return todos;
    }

    public void addNewTodo(String name, String desc, boolean isDone, LocalDate targetDate) {
        todos.add(new Todo(
            ++todoCount,
            name,
            desc,
            isDone,
            targetDate
        ));
    }
}
