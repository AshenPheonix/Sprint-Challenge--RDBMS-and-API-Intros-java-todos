package com.brandonporter.javatodobackend.repositories;

import com.brandonporter.javatodobackend.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
