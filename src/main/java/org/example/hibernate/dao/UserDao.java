package org.example.hibernate.dao;

import org.example.hibernate.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> listUsers();
    void update(long id, User user);
}
