package org.example.basic.factory;

import org.example.basic.common.User;

public class UserServiceImpl implements UserService{
    @Override
    public void login(String name, String password) {
        System.out.println("login");
    }

    @Override
    public void register(User user) {
        System.out.println("register");
    }
}
