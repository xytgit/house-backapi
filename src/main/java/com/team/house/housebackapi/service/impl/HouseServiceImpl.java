package com.team.house.housebackapi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.HouseExample;
import com.team.house.housebackapi.mapper.HouseMapper;
import com.team.house.housebackapi.service.HouseService;
import com.team.house.housebackapi.util.HouseCondition;
import com.team.house.housebackapi.util.PageParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;

    /**
     * 发布房屋信息
     * @param house 房屋信息实体
     * @return 0失败1成功
     */
    @Override
    public int addHouse(House house) {
        return houseMapper.insertSelective(house);
    }

    /**
     * 通过用户id获取房屋信息
     * @param userId 用户id
     * @param pageParameter 分页相关数据
     * @return 房屋信息集合（分页相关）
     */
    @Override
    public PageInfo<House> getHouseByUserId(Integer userId, PageParameter pageParameter) {
        PageHelper.startPage(pageParameter.getCurPage(), pageParameter.getPageSize());
        return new PageInfo<House>(houseMapper.getHouseByUserId(userId));
    }

    /**
     * 通过id删除房屋信息
     * @param id 房屋信息id（主键）
     * @return 0失败1成功
     */
    @Override
    public int deleteById(String id) {
        return houseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 通过条件查询房屋信息
     * @param houseCondition 条件实体（包含分页）
     * @return 房屋信息集合（分页相关）
     */
    @Override
    public PageInfo<House> getBroswerHouse(HouseCondition houseCondition) {
        PageHelper.startPage(houseCondition.getCurPage(),houseCondition.getPageSize());
        return new PageInfo<House>(houseMapper.getBroswerHouse(houseCondition));
    }
}
