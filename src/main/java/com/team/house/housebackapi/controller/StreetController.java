package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Street;
import com.team.house.housebackapi.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class StreetController {
    @Autowired
    private StreetService streetService;

    @RequestMapping("/getAllStreetByDistrict")
    public List<Street> getAllStreetByDistrict(Integer id){
        return streetService.getAllByDistrict(id);
    }
}
