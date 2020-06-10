package com.liu.study.spring.boot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @desc
 *      注意要把这个类交给Spring。
 *
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/4 17:38
 */
@Aspect
@Component
@Order(100)
public class LoggerAspect {

    @Before("execution(* com.liu.study.spring.boot.service.*.*(..))")
    public void before() {
        System.out.println(" ======= Logger Before ==========");
    }

}
