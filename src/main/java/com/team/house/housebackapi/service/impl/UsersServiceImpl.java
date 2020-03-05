package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Users;
import com.team.house.housebackapi.entity.UsersExample;
import com.team.house.housebackapi.mapper.UsersMapper;
import com.team.house.housebackapi.service.UsersService;
import com.team.house.housebackapi.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 用户注册
     * @param users 用户实体
     * @return 0失败1成功
     */
    @Override
    public int userReg(Users users) {
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));
        return usersMapper.insertSelective(users);
    }

    /**
     *用户登录
     * @param username 用户名
     * @param password 密码
     * @return 用户实体
     */
    @Override
    public Users userLogin(String username, String password) {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andNameEqualTo(username);
        criteria.andPasswordEqualTo(MD5Utils.md5Encrypt(password));
        List<Users> list = usersMapper.selectByExample(usersExample);
        if (list!=null&&list.size()==1){
            return list.get(0);
        }
        return null;
    }
}
