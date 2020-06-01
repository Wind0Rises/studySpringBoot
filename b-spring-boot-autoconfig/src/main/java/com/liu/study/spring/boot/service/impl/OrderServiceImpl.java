package com.liu.study.spring.boot.service.impl;

import com.liu.study.spring.boot.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/5/30 22:30
 * @version 1.0.0
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Override
    public void getOrderMessage() {
        System.out.println("This is Order Message");
    }
}
