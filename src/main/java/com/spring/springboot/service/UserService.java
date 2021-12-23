package com.spring.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.spring.springboot.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    User getUser(int id);

    void addUser(User user);

    void deleteUser(User user);

    void editUser(User user);

    User getByName(String username);
}
