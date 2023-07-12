package org.example.basic.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// 加个注解表示是切面类
@Aspect
public class MyAspect {
//    类切入点
    @Pointcut("execution(* *..UserServiceImpl.*(..))")
    public void myPointcut(){}
//  额外功能：无需实现之前的接口，但要添加@Around()表示是额外功能
// 原始方法：ProceedingJoinPoint joinPoint，表示原始方法method
//    切入点：Around里添加，代替配置文件
    @Around(value = "myPointcut()")
    public Object arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aspect join");
        Object o = joinPoint.proceed();
        return o;
    }

    @Around(value = "myPointcut()")
    public Object arround1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aspect join");
        Object o = joinPoint.proceed();
        return o;
    }
}
