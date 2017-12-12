package com.hlw.service;

import com.hlw.domain.User;
import com.hlw.domain.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    int add(User user);
}
