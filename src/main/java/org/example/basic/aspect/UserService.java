package org.example.basic.aspect;

import org.example.basic.common.User;

public interface UserService {
    public boolean login(String name,String passwd);

    public void register(User user);
}
