package org.example.dao;

import org.example.model.User;
import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    List<User> findAllUsers();
}
