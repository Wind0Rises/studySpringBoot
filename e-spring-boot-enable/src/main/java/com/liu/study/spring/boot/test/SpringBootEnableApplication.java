package com.liu.study.spring.boot.test;

import com.liu.study.spring.boot.enable.EnableCustomAnnotation;
import com.liu.study.spring.boot.enable.injected.MerchantService;
import com.liu.study.spring.boot.enable.injected.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/12 14:58
 * @version 1.0.0
 */
@SpringBootApplication


/**
 * 注意加EnableCustomAnnotation和不加EnableCustomAnnotation的区别。
 * 这样写是手动注入，如何做到自动注入呢？？
 *
 * 如何做到自动注入：
 *      需要在MATE-INF目录下新建spring.factories文件，并配置org.springframework.boot.autoconfigure.EnableAutoConfiguration=
 *      com.liu.study.spring.boot.enable.config.EnableCustomConfiguration。指向自己的配置类，这个配置类相当于一个对应的xml文件。
 */
// @EnableCustomAnnotation
public class SpringBootEnableApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootEnableApplication.class, args);

        UserService userService = context.getBean(UserService.class);
        userService.queryUserInfo();

        MerchantService merchantService = context.getBean(MerchantService.class);
        merchantService.queryMerchantInfo();
    }

}
