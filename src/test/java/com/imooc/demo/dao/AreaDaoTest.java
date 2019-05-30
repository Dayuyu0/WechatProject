package com.imooc.demo.dao;

import static org.junit.Assert.assertEquals;
import com.imooc.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    //通过spring容器注入Dao的实现类
    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() {
        // 验证预期值和实际值是否相符
        List<Area> areaList = areaDao.queryArea();
        assertEquals(3,areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area area  = areaDao.queryAreaById(1);
        assertEquals("西安",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("兴平");
        area.setPriority(3);
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("小兴平");
        area.setAreaId(4);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(4);
        assertEquals(1,effectedNum);
    }
}