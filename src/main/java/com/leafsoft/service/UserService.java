package com.leafsoft.service;

import java.util.List;

import com.leafsoft.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
