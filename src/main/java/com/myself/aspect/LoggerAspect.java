package com.myself.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    @Around(value = "execution(* com.myself.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature().getName());

        //这一句话作用，当该切面以后和某个核心功能交织后，用来切入另一个线程执行核心功能的代码
        Object object = joinPoint.proceed();

        System.out.println("end log:" + joinPoint.getSignature().getName());


        return object;
    }
}
