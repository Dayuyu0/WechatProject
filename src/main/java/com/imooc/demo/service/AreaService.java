package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 查询全部
     * @return areaList
     */
    List<Area> getAreaList();
    /**
     *  根据id查找
     *  @return area
     */
    Area getAreaById(int areaId);
    /**
     * 插入数据
     * @param  area
     * @return
     */
    boolean addArea(Area area);
    /**
     * 更新数据
     * @param  area
     * @return
     */
    boolean modifyArea(Area area);
    /**
     * 根据id删除数据
     * @param  areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
