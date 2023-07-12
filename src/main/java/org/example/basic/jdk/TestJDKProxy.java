package org.example.basic.jdk;

import org.example.basic.common.UserService;
import org.example.basic.common.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKProxy {
    public static void main(String[] args){
        // 创建原始对象
        UserService userService = new UserServiceImpl();
        // JDK创建动态代理
        InvocationHandler handler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
                System.out.println("add handler");
                Object o = method.invoke(userService, args);
                return o;
            }
        };
        /*
            三个参数及负责功能
            claasloader:虚拟机为每一个.class文件分配ClassLoader
            interfaces：实现代理类和原始类实现相同接口
            invocationhandler：额外功能，之前写过的invoke方法：MethodInterceptor类与InvocationHandler类
                                MethodInterceptor中方法是阉割版，InvocationHandler中需要提供Proxy（忽略），method（原始方法），args（原始方法参数）三个参数
         * */
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(TestJDKProxy.class.getClassLoader(),userService.getClass().getInterfaces(),handler);
        userServiceProxy.login("bacon","123456");
        userServiceProxy.register("bacon","123456");
    }
}
