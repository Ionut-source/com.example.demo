package com.example.demo.aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    //* is WildCard the return type
    //.. is WildCard for paramater

    @Pointcut("execution(* com.example.demo.services.MyService.castToString(..))")
    public void logEntry() {
    }

    @Before("com.example.demo.aspects.logAspects.logEntry()")
    public void logBefore() {
        System.out.println("Before manipulating data");
    }

    @AfterReturning("com.example.demo.aspects.LogAspect.logEntry()")
    public void logAfterReturning() {
        System.out.println("After returning manipulating data");
    }

    @After("com.example.demo.aspects.LogAspect.logEntry()")
    public void logAfter() {
        System.out.println("After manipulating data");
    }

    @AfterThrowing
    public void lingAfterThrowing() {
        System.out.println("After exception thrown");
    }
}
