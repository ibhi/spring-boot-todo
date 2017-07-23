package com.noobish.controller;

import com.noobish.model.Todo;
import com.noobish.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/todos", method = RequestMethod.GET)
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @RequestMapping(value="/todos", method = RequestMethod.POST)
    public Todo saveTodo(@RequestBody Todo todo) {
        return todoService.saveTodo(todo);
    }
}
