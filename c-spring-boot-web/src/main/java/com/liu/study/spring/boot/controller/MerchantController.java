package com.liu.study.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc spring boot merchant控制层
 * @author Liuweian
 * @createTime 2020/5/30 22:54
 * @version 1.0.0
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @RequestMapping("/first")
    public String merchantControllerFirstMethod() {
        System.out.println("This is Merchant Controller First Method");
        return "success";
    }

}
