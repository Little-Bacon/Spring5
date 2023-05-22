package org.example.basic;

public class UserServiceImpl extends UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public void register(String name,String passwd){
        System.out.println("name="+name+"Password="+passwd);
    }
}
