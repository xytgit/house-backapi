package com.team.house.housebackapi.controller;

import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.Users;
import com.team.house.housebackapi.service.HouseService;
import com.team.house.housebackapi.util.FileUploadUtil;
import com.team.house.housebackapi.util.HouseCondition;
import com.team.house.housebackapi.util.PageParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @RequestMapping("/fabuHouse")
    public String fabuHouse(House house, HttpSession session, @RequestParam(value = "img", required = false) MultipartFile img) {
        //文件上传
        String path="D:\\images";
        String fileName = FileUploadUtil.upload(img, path);
        house.setPath(fileName);
        house.setId(System.currentTimeMillis() + "");
        Users users = (Users) session.getAttribute("users");
        house.setUserId(users.getId());
        int temp = houseService.addHouse(house);
        if (temp > 0) {
            return "{\"result\":1}";
        } else {
            return "{\"result\":1}";
        }
    }

    @RequestMapping("/getHouseByUserId")
    public Map<String, Object> getHouseByUserId(PageParameter pageParameter, HttpSession session) {
        Users users = (Users) session.getAttribute("users");
        PageInfo<House> pageInfo = houseService.getHouseByUserId(users.getId(), pageParameter);
        Map<String, Object> map = new HashMap<>();
        map.put("curPage",pageInfo.getPageNum());
        map.put("totalPage", pageInfo.getPages());
        map.put("houseList", pageInfo.getList());
        return map;
    }

    @RequestMapping("delHouse")
    public String delHouse(String id,String fileName){
        int temp = houseService.deleteById(id);
        if (temp > 0) {
            File file = new File("d:\\images\\" +fileName);
            if (file.exists()) {
                file.delete();
            }
            return "{\"result\":1}";
        }else {
            return "{\"result\":0}";
        }
    }

    @RequestMapping("/searchHouse")
    public Map<String,Object> searchHouse(HouseCondition houseCondition){
        PageInfo<House> pageInfo = houseService.getBroswerHouse(houseCondition);
        if (pageInfo.getList().size()==0){
            houseCondition.setCurPage(1);
            pageInfo = houseService.getBroswerHouse(houseCondition);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("totalPage", pageInfo.getPages());
        map.put("houseList", pageInfo.getList());
        map.put("curPage", pageInfo.getPageNum());
        return map;
    }
}
