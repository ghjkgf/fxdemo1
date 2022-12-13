package com.example.demo.controller.service;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zsl
 * @date 2022/12/10
 * @apiNote
 */
public class UserService {
    @Autowired
    UserDao userDao;
    
}
