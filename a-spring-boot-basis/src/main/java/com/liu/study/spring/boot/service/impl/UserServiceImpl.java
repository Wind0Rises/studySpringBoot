package com.liu.study.spring.boot.service.impl;

import com.liu.study.spring.boot.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @desc
 * @author Liuweian
 * @createTime 2020/5/30 13:52
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public void getUsername() {
        System.out.println("获取用户信息。。。。");
    }

}
