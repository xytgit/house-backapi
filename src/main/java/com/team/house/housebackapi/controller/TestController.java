package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.Users;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class TestController {

    @RequestMapping("/test01")
    public String test01(@RequestParam(name = "img") MultipartFile img, House house) {
        System.out.println(img.getOriginalFilename());
        return "{\"result\":\"1\"}";
    }
}
