package org.example.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;


@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* org.example.aopdemo..*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("執行方法：" + joinPoint.getSignature().getName());

        Object result;
        try {
            result = joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("方法出錯：" + e.getMessage());
            throw e;
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("方法 " + joinPoint.getSignature().getName() + " 執行時間: " + timeTaken + " 毫秒");

        return result;
    }
}
