package org.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeoferAopTest {
    @Before("execution(* org.example.aopdemo..*(..))")
    public void logBeforeMethodExecution() {
        System.out.println("方法執行前進行日誌記錄...");
    }
}
