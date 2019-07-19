package com.brandonporter.javatodobackend.services;

import com.brandonporter.javatodobackend.models.Role;

import java.util.List;

public interface RoleService
{
    List<Role> findAll();

    Role findRoleById(long id);

    void delete(long id);

    Role save(Role role);
}