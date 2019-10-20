package com.solid.dip.lowlevel;

import com.solid.dip.highlevel.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserRegisterDao implements UserDao {

    private List<String> users = new ArrayList<>();

    public UserRegisterDao(){
        users.add("Sarah");
        users.add("Mark");
        users.add("Chris");
    }

    @Override
    public List<String> findAll() {
        return users;
    }

    @Override
    public void save(String user) {
        users.add(user);
    }
}