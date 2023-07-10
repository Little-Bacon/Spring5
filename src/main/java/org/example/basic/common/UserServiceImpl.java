package org.example.basic.common;

public class UserServiceImpl implements UserService {
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
}
