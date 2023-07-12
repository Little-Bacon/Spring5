package org.example.basic.factory;

import org.example.basic.common.User;

public interface UserService {
    public void login(String name,String password);
    public void register(User user);
}
