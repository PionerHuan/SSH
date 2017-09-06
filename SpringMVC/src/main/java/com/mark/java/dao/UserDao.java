package com.mark.java.dao;

import com.mark.java.entity.User;

import java.util.List;

public interface UserDao {
    public int save(User u);
    public List<User> findAll();
}
