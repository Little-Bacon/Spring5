package org.example.basic;

public class UserServiceProxy implements UserService{
//    代理为原始类提供额外功能，所以需要原始类对象
    private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public void register(String name, String passwd) {
        userService.register(name, passwd);
    }

    @Override
    public boolean login(String name, String passwd) {
        System.out.println("here adds a log");
        return userService.login(name, passwd);
    }

}
