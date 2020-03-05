package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Users;

public interface UsersService {
    /**
     * 用户注册
     * @param users 用户实体
     * @return 0失败1成功
     */
    int userReg(Users users);

    /**
     *用户登录
     * @param username 用户名
     * @param password 密码
     * @return 用户实体
     */
    Users userLogin(String username,String password);
}
