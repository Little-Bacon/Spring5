package org.test;

import org.example.basic.UserService;
import org.example.basic.UserServiceProxy;
import org.junit.Test;

public class TestAOP {
    @Test
    public void test1(){
//        想要核心功能+附加功能就必须使用代理对象
        UserService userService = new UserServiceProxy();
        userService.register("bacon","123456");
        userService.login("bacon","123456");
    }
}
