package org.example.basic.CGlib;

import org.example.basic.common.User;

public class UserService {
    public void login(String name, String password){
        System.out.println("CG-login");
    }
    public void register(User user){
        System.out.println("CG-register");
    }
}
