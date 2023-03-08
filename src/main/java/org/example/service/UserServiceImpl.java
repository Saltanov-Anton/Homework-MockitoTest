package org.example.service;


import org.example.model.User;

public class UserServiceImpl implements UserService{

    @Override
    public boolean checkUserExist(User user) {
        return false;
    }
}
