package com.brandonporter.javatodobackend.services;


import com.brandonporter.javatodobackend.models.Todo;
import com.brandonporter.javatodobackend.views.CountTodos;

import java.util.ArrayList;
import java.util.List;

public interface TodoService
{
    List<Todo> findAll();

    Todo findTodoById(long id);

    List<Todo> findByUserName (String username);

    void delete(long id);

    Todo save(Todo todo);

    Todo update(Todo todo, long id);

    ArrayList<CountTodos> getCountTodos();
}
