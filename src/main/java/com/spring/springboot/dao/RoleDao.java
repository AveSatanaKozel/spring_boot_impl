package com.spring.springboot.dao;

import com.spring.springboot.model.Role;


public interface RoleDao {
    Role getRoleByName(String name);

    Role getRoleById(int id);
}
