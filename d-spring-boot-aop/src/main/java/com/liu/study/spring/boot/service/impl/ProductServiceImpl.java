package com.liu.study.spring.boot.service.impl;

import com.liu.study.spring.boot.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * @desc
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/4 17:40
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public void getProductMessage() {
        System.out.println("This is Get Product Message");
    }

}
