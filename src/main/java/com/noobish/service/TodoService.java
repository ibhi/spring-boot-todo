package com.noobish.service;

import com.noobish.model.Todo;
import com.noobish.repository.TodoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodo(Long id) {
        return todoRepository.findOne(id);
    }

    public Todo saveTodo(Todo todo) {
        return todoRepository.saveAndFlush(todo);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        Todo existingTodo = todoRepository.findOne(id);
        BeanUtils.copyProperties(updatedTodo, existingTodo);
        return todoRepository.saveAndFlush(existingTodo);
    }
}
