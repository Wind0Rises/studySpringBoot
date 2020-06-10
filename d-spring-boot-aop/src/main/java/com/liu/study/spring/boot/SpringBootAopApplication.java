package com.liu.study.spring.boot;

import com.liu.study.spring.boot.service.IProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @desc
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/4 17:32
 */
@SpringBootApplication
public class SpringBootAopApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootAopApplication.class, args);
        IProductService productService = context.getBean(IProductService.class);
        productService.getProductMessage();
    }

}
