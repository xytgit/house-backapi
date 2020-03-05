package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.District;
import com.team.house.housebackapi.entity.DistrictExample;
import com.team.house.housebackapi.mapper.DistrictMapper;
import com.team.house.housebackapi.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<District> getAll() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
