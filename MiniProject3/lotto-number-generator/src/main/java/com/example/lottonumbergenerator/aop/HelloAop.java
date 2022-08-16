package com.example.lottonumbergenerator.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

@Component
@Aspect
public class HelloAop {

    @Pointcut("execution(* com.example.lottonumbergenerator.controller..*.*(..))")
//    private void cutHelloController() {}
    private void cutLottoNumberController(){}

    @Pointcut("@annotation(com.example.lottonumbergenerator.annotation.Timer)")
    private void enableTimer(){}


    @Before("cutLottoNumberController()")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("메소드 이름 : " + method.getName());
        System.out.println("메소드 리턴 타입 : " + method.getReturnType().getName());
    }


    @Around("cutLottoNumberController() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("시작");

        // 실행 전
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        joinPoint.proceed();

        // 실행 후
        stopWatch.stop();

        System.out.println("total time : " + stopWatch.getTotalTimeSeconds());
        System.out.println("끝");
    }


}
