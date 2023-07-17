package org.test;


import DAO_example.dao.UserDAO;
import DAO_example.entity.User;
import DAO_example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBatisSpring {
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/DAOContext/applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = new User();
        user.setName("bacon");
        user.setPassword("123456");
        userDAO.save(user);
    }
    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("DAOContext/applicationContext.xml");
        UserService userService = (UserService)ctx.getBean("userService");

        User user = new User();
        user.setName("test");
        user.setPassword("123456");
        userService.register(user);
    }

}
