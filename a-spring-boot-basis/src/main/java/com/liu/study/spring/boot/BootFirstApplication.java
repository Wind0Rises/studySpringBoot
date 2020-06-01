package com.liu.study.spring.boot;

import com.liu.study.spring.boot.service.IUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot追踪源码，第一次。
 *
 * SpringBoot核心依赖Spring：spring-core、spring-beans、spring-context、spring-aop、spring-expression、spring-jcl。
 *
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/5/30 13:31
 */
@ComponentScan
public class BootFirstApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootFirstApplication.class, args);
        IUserService userService = applicationContext.getBean(IUserService.class);
        userService.getUsername();
    }

}
