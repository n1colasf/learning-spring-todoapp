package com.nicolasf.learningspringtodoapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller //-> with this commented, it will be ignored by Spring, and the other JPA controller will be used
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "list-todos")
    public String listAllTodos(ModelMap model) {
        String userName = getLoggedInUsername(model);
        List<Todo> todos = todoService.findByUser(userName);
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    private static String getLoggedInUsername(ModelMap model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        model.put("todo", new Todo(
            0,
                getLoggedInUsername(model),
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
                getLoggedInUsername(model),
            todo.getDesc(),
            false,
            todo.getTargetDate()
        );
        return "redirect:list-todos";
    }

    @RequestMapping(value = "delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteTodoById(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";
        }
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }
}
