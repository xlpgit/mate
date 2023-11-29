package com.mate.fund.service;

import com.mate.fund.entity.User;
import com.mate.fund.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {
    @Resource
    UserMapper userMapper;

    public User getUser(int id) {
        return userMapper.selectById(id);
    }
}
