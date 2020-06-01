package com.liu.study.spring.boot;

import com.liu.study.spring.boot.service.IOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Boot自动配置。
 * <p>
 * Spring Boot Start核心依赖：spring-boot.jar、spring-boot-autoconfigure.jar、spring-boot-starter-logging.jar
 *
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/5/30 22:06
 */
@SpringBootApplication
public class BootSecondApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootSecondApplication.class, args);
        IOrderService orderService = applicationContext.getBean(IOrderService.class);
        orderService.getOrderMessage();
    }

}
