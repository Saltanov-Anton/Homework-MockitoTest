package org.example.dao;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        users.add(new User("Petya"));
        users.add(new User("Masha"));
        users.add(new User("Anton"));
    }

    @Override
    public User getUserByName(String name) {
        User user = users
                .stream()
                .filter(e -> name.equals(e.getName()))
                .findAny()
                .orElse(null);

        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
