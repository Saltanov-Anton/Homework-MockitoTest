
package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.User;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean checkUserExist(User user) {
        return user.equals(userDao.getUserByName(user.getName()));
    }
}
