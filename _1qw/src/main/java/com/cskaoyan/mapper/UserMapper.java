package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User SelectUserByusernameandPaasword(@Param("username") String username, @Param("password") String password);
}
