package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 查询全部
     * @return areaList
     */
    List<Area> queryArea();
    /**
     *  根据id查找
     *  @return area
     */
    Area queryAreaById(int areaId);
    /**
     * 插入数据
     * @param  area
     * @return
     */
    int insertArea(Area area);
    /**
     * 更新数据
     * @param  area
     * @return
     */
    int updateArea(Area area);
    /**
     * 根据id删除数据
     * @param  areaId
     * @return
     */
    int deleteArea(int areaId);
}
