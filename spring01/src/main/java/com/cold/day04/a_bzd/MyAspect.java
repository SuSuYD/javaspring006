package com.cold.day04.a_bzd;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类，用于确定我们的通知（before和after，也可以是业务代码）
 * 实现 MethodInterceptor 方法，导的是org.aopalliance.intercept.MethodInterceptor 包
 * MethodInterceptor 环绕通知，在切片类完成原本方法的调用
 *
 * 这个切面类用来记录日志
 */
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //前置代码
        System.out.println("before");
        //手动执行目标方法
        Object proceed = invocation.proceed();
        //后置代码
        System.out.println("after");
        return proceed;
    }
}
