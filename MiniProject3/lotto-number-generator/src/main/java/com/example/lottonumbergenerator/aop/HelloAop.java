package com.example.lottonumbergenerator.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class HelloAop {

    @Pointcut("execution(* com.example.lottonumbergenerator.controller..*.*(..))")
    private void cutHelloController() {}

    @Before("cutHelloController()")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("메소드 이름 : " + method.getName());
        System.out.println("메소드 리턴 타입 : " + method.getReturnType().getName());
    }

    /*
    @Around("cutHelloController()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("시작");
        joinPoint.proceed();
        System.out.println("끝");
    }
    */

}
