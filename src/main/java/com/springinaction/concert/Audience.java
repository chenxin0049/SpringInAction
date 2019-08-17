package com.springinaction.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* com.springinaction.concert.Performance.perform(..))")
    public void performance() {}

    /*@Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones.");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats.");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund.");
    }*/

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones.");
            System.out.println("Taking seats.");

            jp.proceed();    //将控制权交给被通知的方法

            System.out.println("CLAP CLAP CLAP!!!");
        }
        catch (Throwable e){
            System.out.println("Demanding a refund.");
        }
    }
}
