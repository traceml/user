package com.cskaoyan.service.imp;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService {
    @Autowired
    UserMapper mapper;
    @Override
    public User login(String username, String password) {
        return mapper.SelectUserByusernameandPaasword(username,password);
    }
}
