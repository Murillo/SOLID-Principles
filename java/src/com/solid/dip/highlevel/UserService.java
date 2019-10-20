package com.solid.dip.highlevel;

import java.util.List;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public List<String> findAll() {
        return userDao.findAll();
    }

    public void save(String user) {
        userDao.save(user);
    }

}
