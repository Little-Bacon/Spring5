package org.example.basic;

import org.springframework.beans.factory.BeanFactory;

public interface UserService {
    public void register(String name,String passwd);
    public boolean login(String name,String passwd);
}
