package com.imooc.demo.controller;

import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AreaController {
    //注入Service接口
    @Autowired
    private AreaService areaService;

    /**
     *查询所有信息逻辑处理
     * @return HashMap
     */
    //映射URL路径，方法为GET
    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        //定义一个Map集合，用来放返回的对象集合
        Map<String,Object> modelMap = new HashMap<String,Object>();
        //获取全部信息
        List<Area> list = areaService.getAreaList();
        //放入Map集合中然后返回即可
        modelMap.put("areaList",list);
        return modelMap;
    }

    /**
     * 根据areaId查询对象信息
     * @param areaId
     * @return
     */
    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer areaId){
        //定义一个Map集合，用来放返回的对象集合
        Map<String,Object> modelMap = new HashMap<String,Object>();
        //获取对象信息
        Area area = areaService.getAreaById(areaId);
        //放入Map集合中然后返回即可
        modelMap.put("area",area);
        return modelMap;
    }

    /**
     * 添加信息
     * @return boolean
     */
    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        //定义一个Map集合，用来放返回的对象集合
        Map<String,Object> modelMap = new HashMap<String,Object>();
        //放入Map集合中然后返回即可
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

    /**
     * 修改信息
     * @return boolean
     */
    @RequestMapping(value = "/updatearea",method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        //定义一个Map集合，用来放返回的对象集合
        Map<String,Object> modelMap = new HashMap<String,Object>();
        //放入Map集合中然后返回即可
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }

    /**
     * 删除信息
     * @return boolean
     */
    @RequestMapping(value = "/deletearea",method = RequestMethod.GET)
    private Map<String,Object> deleteArea(Integer areaId){
        //定义一个Map集合，用来放返回的对象集合
        Map<String,Object> modelMap = new HashMap<String,Object>();
        //放入Map集合中然后返回即可
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }

}
