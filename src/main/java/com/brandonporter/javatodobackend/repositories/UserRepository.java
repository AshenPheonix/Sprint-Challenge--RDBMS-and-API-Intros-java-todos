package com.brandonporter.javatodobackend.repositories;

import com.brandonporter.javatodobackend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String name);
}
