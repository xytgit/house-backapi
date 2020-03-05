package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Street;

import java.util.List;

public interface StreetService {
    List<Street> getAllByDistrict(Integer id);
}
