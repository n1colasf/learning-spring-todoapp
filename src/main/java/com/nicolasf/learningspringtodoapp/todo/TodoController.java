package com.nicolasf.learningspringtodoapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
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

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        model.put("todo", new Todo(
            0,
            (String) model.get("name"),
            "",
            false, LocalDate.now()
                ));
        return "todo";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
       if (result.hasErrors()) {
           return "todo";
       }
        todoService.addNewTodo(
            (String) model.get("name"),
            todo.getDesc(),
            false,
            todo.getTargetDate()
        );
        return "redirect:list-todos";
    }
}
