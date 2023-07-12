package org.example.basic.aspect;

import org.example.basic.common.User;
import org.example.basic.common.UserDAO;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserServiceImpl implements UserService, ApplicationContextAware {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public void register(String name,String passwd){
//        业务功能
        System.out.println("name="+name+"Password="+passwd);
    }

    @Override
    public boolean login(String name, String passwd) {
        System.out.println("login");
        return false;
    }

    @Override
    public void register(User user) {
        UserService userService = (UserService) ctx.getBean("userService");
        userService.login("bacontest","123456789");
        System.out.println("regi");
    }

    private ApplicationContext ctx;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
