package org.asentors.dao;

import org.asentors.model.User;

import java.util.List;

public interface UserDao {
    void create(User usr);
    List getAllUsers();
    void update(User usr);
    void delete(User usr);
}
