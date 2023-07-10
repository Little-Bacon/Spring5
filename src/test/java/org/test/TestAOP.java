package org.test;

import org.example.basic.common.UserService;
import org.example.basic.dynamic.Around;
import org.example.basic.proxy.UserServiceProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void test1(){
//        想要核心功能+附加功能就必须使用代理对象
        UserService userService = new UserServiceProxy();
        userService.register("bacon","123456");
        userService.login("bacon","123456");
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/AOPContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService.login("bacon","123456"));
        userService.register("bacon_register","12346");
    }

    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/AOPContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService.login("bacon","123456"));
//        Around around= (Around) ctx.getBean("around");
//        System.out.println("result=" + result);
    }
}