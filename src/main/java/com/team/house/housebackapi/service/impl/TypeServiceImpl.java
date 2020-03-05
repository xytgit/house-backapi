package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Type;
import com.team.house.housebackapi.entity.TypeExample;
import com.team.house.housebackapi.mapper.TypeMapper;
import com.team.house.housebackapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAll() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
