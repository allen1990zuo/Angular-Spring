package com.jifeng.backend.service;

import com.jifeng.backend.dao.UserDao;
import com.jifeng.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User save(User user){
        return userDao.save(user);
    }
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
