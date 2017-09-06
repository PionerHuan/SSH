package com.mark.java.service.impl;

import com.mark.java.dao.UserDao;
import com.mark.java.entity.User;
import com.mark.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void saveUsers(List<User> us) {
        for (User u:us) {
            userDao.save(u);
        }
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}
