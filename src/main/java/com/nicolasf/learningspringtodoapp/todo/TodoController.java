package com.nicolasf.learningspringtodoapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUser("nicolas");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
}
