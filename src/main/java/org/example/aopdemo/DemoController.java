package org.example.aopdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("執行 sayHello 方法");
        return "Hello AOP!";
    }

    @GetMapping("/error")
    public String throwError() {
        throw new RuntimeException("故意觸發的錯誤");
    }
    @GetMapping("/test")
    public String testMethod() {
        System.out.println("執行測試方法");
        return "測試成功";
    }
}

