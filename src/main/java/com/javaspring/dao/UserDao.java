package com.javaspring.dao;

import com.javaspring.models.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> getAllUsers();
    User getUserById(long id);
    void update(long id, User user);
    void removeUserById(long id);
}
