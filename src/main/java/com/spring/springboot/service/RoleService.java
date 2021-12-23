package com.spring.springboot.service;

import com.spring.springboot.model.Role;

public interface RoleService {
    Role getRoleByName(String name);

    Role getRoleById(int id);
}
