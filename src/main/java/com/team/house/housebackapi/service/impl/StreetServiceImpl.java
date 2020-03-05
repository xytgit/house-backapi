package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Street;
import com.team.house.housebackapi.entity.StreetExample;
import com.team.house.housebackapi.mapper.StreetMapper;
import com.team.house.housebackapi.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {
    @Autowired
    private StreetMapper streetMapper;

    @Override
    public List<Street> getAllByDistrict(Integer id) {
        if (id!=null){
            StreetExample streetExample=new StreetExample();
            StreetExample.Criteria criteria = streetExample.createCriteria();
            criteria.andDistrictIdEqualTo(id);
            List<Street> list = streetMapper.selectByExample(streetExample);
            return list;
        }else {
            return null;
        }
    }
}
