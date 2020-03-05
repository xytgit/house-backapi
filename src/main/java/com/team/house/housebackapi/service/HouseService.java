package com.team.house.housebackapi.service;

import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.HouseExample;
import com.team.house.housebackapi.util.HouseCondition;
import com.team.house.housebackapi.util.PageParameter;

import java.util.List;

public interface HouseService {
    /**
     * 发布房屋信息
      * @param house 房屋信息实体
     * @return 0失败1成功
     */
    int addHouse(House house);

    /**
     * 通过用户id获取房屋信息
     * @param userId 用户id
     * @param pageParameter 分页相关数据
     * @return 房屋信息集合（分页相关）
     */
    PageInfo<House> getHouseByUserId(Integer userId,PageParameter pageParameter);

    /**
     * 通过id删除房屋信息
     * @param id 房屋信息id（主键）
     * @return 0失败1成功
     */
    int deleteById(String id);

    /**
     * 通过条件查询房屋信息
     * @param houseCondition 条件实体（包含分页）
     * @return 房屋信息集合（分页相关）
     */
    PageInfo<House> getBroswerHouse(HouseCondition houseCondition);
}
