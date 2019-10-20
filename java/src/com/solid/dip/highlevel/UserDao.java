package com.solid.dip.highlevel;

import java.util.List;

/**
 * The UserDao interface is used as an abstraction for
 * communication between high-level and low-level layers.
 */
public interface UserDao {
    List<String> findAll();
    void save(String user);
}