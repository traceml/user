package com.cskaoyan.service;

import com.cskaoyan.bean.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User login(String username,String password);
}
