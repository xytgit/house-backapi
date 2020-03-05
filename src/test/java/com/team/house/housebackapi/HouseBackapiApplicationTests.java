package com.team.house.housebackapi;

import com.team.house.housebackapi.entity.HouseExample;
import com.team.house.housebackapi.mapper.HouseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseBackapiApplicationTests {
    @Autowired
    private HouseMapper houseMapper;

    @Test
    public void contextLoads() {
        System.out.println("行数是:"+houseMapper.selectByExample(new HouseExample()).size());
    }

}
