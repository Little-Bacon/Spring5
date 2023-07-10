package org.example.basic.dynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around implements MethodInterceptor {
    /**
     *
     * @param invocation：额外功能所增加给的原始方法，类似Method；
     *                  例如login、register
     * @return 原始方法执行后的返回值
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object o = invocation.proceed();   // 原始方法运行
        return o;
    }
}
