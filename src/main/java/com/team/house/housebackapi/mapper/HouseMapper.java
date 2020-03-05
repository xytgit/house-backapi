package com.team.house.housebackapi.mapper;

import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.HouseExample;
import com.team.house.housebackapi.util.HouseCondition;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    //通过用户id查找相应房屋信息
    List<House> getHouseByUserId(Integer userId);

    //条件查询相关房屋信息
    List<House> getBroswerHouse(HouseCondition houseCondition);
}