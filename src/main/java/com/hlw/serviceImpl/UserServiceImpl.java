package com.hlw.serviceImpl;

import com.hlw.domain.User;
import com.hlw.mapper.UserMapper;
import com.hlw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        System.out.println("dsfsdf");
        return userMapper.add(user);
    }
}
