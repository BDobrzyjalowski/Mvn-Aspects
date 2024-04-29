package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TestAspect {
    @Pointcut("execution(* *..*.*(..))")
    void myClassPointCut() {
    }


    @Before("myClassPointCut()")
    public void logBeforeMainMethod(JoinPoint joinPoint) {
        System.out.println(String.format("Method %s started", joinPoint.getSignature()));
    }

    @After("myClassPointCut()")
    public void logAfterMainMethod(JoinPoint joinPoint) {
        System.out.println(String.format("Method %s finished", joinPoint.getSignature()));
    }

    @AfterThrowing(pointcut = "myClassPointCut()", throwing = "e")
    public void afterThrowingAdvice(JoinPoint jp, Throwable e){
        System.out.println("Method Signature: "  + jp.getSignature());
        System.out.println("Exception: "+e);
    }

}
