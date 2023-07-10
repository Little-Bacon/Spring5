package org.example.basic.dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {
    /**
     *
     * @param method：额外功能增加的那个原始功能，例如login、register，看切入点在哪里
     * @param args：原始功能的参数
     * @param target：原始对象（UserService类的对象）
     */

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("--logging--");
    }
}
