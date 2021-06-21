package com.cold.day04.d_aspectJ_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 这个切面类中可以写多个通知
 */
//切面类自动装配bean
@Component
//声明这是一个切面类
@Aspect
public class MyAspect {
    /**
     * 定义通用切入点
     */
    @Pointcut("execution(* com.cold.day04.d_aspectJ_anno.*.*(..))")
    public void myPointCat(){}
    /**
     * 前置通知
     * JoinPoint 用来表示这是个前置通知
     */
    /**
     * 添加 @Before 注解进行绑定
     * value值为切入点  execution(* com.cold.day04.d_aspectJ_anno.*.*(..))
     * @param joinPoint
     */
    @Before("execution(* com.cold.day04.d_aspectJ_anno.*.*(..))")
    public void myBefore(JoinPoint joinPoint){
        //可以任意写处理代码或者业务代码
        //joinPoint.getSignature().getName()  获取执行方法的名字
        System.out.println("前置通知"+joinPoint.getSignature().getName());
    }
    /**
     * 后置通知  可以返回信息
     * Object object 是返回值
     */
    @AfterReturning(value = "myPointCat()",returning = "object")
    public void afterReturning(JoinPoint joinPoint,Object object){
        //可以任意写处理代码或者业务代码
        //joinPoint.getSignature().getName()  获取执行方法的名字
        System.out.println("后置通知 返回值："+object);
    }
    /**
     * 环绕通知
     * 使用的是 JoinPoint 的子方法 ProceedingJoinPoint
     */
    @Around(value = "myPointCat()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("执行前");
        Object proceed = joinPoint.proceed();
        System.out.println("执行后");
        return proceed;
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "myPointCat()",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("抛出异常通知"+throwable.getMessage());
    }
    /**
     * 最终通知
     */
    @After(value = "myPointCat()")
    public void after(JoinPoint joinPoint){
        System.out.println("最终通知，方法全部执行结束");
    }
}
