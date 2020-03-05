package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Type;
import com.team.house.housebackapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(value = "*",allowCredentials = "true")
@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/getAllType")
    public List<Type> getAllType(){
        return typeService.getAll();
    }
}
