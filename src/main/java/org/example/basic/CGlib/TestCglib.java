//package org.example.basic.CGlib;
//
//import org.springframework.cglib.proxy.Enhancer;
//import org.springframework.cglib.proxy.MethodInterceptor;
//import org.springframework.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class TestCglib {
//    UserService userService = new UserService();
//    /*
//    通过cglib的方式创建代理对象
//    Enhancer.create()，需要的东西和JDK相同：
//    Enhancer.setClassLoader()
//    Enhancer.setSuperClass()
//    Enhancer.setCallback()
//     */
//    Enhancer enhancer = new Enhancer();
//    enhancer.setClassLoader(TestCglib.class.getClassLoader());
//    enhancer.setSuperclass(UserService.getClass());
//
//    MethodInterceptor interceptor = new MethodInterceptor(){
//        @Override
//        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//            System.out.println("CGplus");
//            Object o = (Object) method.invoke(args);
//            return o;
//        }
//    };
//
//    enhancer.setCallback(interceptor);
//
//}
