package com.codegym.service;

import com.codegym.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceIplm implements UserService {

    private  static Map<Integer, User> users;
    static {
        users = new HashMap<>();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findById(int id) {
        return users.get(id);
    }

    @Override
    public void update(int id, User user) {
        users.put(id, user);
    }

    @Override
    public void remove(int id) {
        users.remove(id);
    }
}
