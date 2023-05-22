package org.test;

import org.example.basic.Constructor.Customer;
import org.example.basic.Person;
import org.example.basic.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.util.Set;

public class TestSpring {
    @Test

//    测试Spring第一个程序
    public void test3(){
//      1.获取Spring工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
//      2.通过工厂类获得对象
//      返回值是Object类，所以需要强制类型转换
        Person person = (Person) ctx.getBean("person");  // bean的id
        System.out.println("person = " + person);
    }

    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        下面这行的方法在配置文件中仅可以有一个类是Person类
//        Person person = ctx.getBean(Person.class);
        Person person = ctx.getBean("person",Person.class); // getbean的重载，不需要强制类型转换了

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName: beanDefinitionNames) {
            System.out.println("beanDefinationName = " + beanDefinitionName);   // 输出的是bean的id值
        }

        String[] getBeanNamesfortype = ctx.getBeanNamesForType(Person.class);  // 返回[所有]Person类bean的id
        for (String name:getBeanNamesfortype){
            System.out.println(name);
        }

        // 是否含有该id的bean
        System.out.println(ctx.containsBeanDefinition("a"));   // return boolean

    }
    @Test
    public void test5(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void test6() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println("p="+person);
    }

//    用于注入测试
    @Test
    public void test7() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        person.setId(1);
        person.setName("bacon");
        System.out.println(person.toString());
    }

    @Test
    public void test8() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
        Set<String> tels = person.getTels();
        System.out.println(tels);
    }

    @Test
    public void test9() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("UserService");
        userService.register("bacon","123456");

    }
    @Test
    public void test10(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = (Customer) ctx.getBean("Customer");
        System.out.println(customer);

    }
    @Test
    public void test11() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection connection = (Connection) ctx.getBean("conn");
        System.out.println(connection);
    }
}
