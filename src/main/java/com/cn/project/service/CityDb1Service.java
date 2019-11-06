package com.cn.project.service;

import com.cn.project.config.DS;
import com.cn.project.config.DataSourceType;
import com.cn.project.dao.CityDb1Mapper;
import com.cn.project.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author moment
 * @date 2019/11/5 15:17
 * @describe
 */
@Service
public class CityDb1Service {
    @Autowired
    private CityDb1Mapper cityDb1Mapper;

    public City getUser(int id) {
        return cityDb1Mapper.getById(id);
    }

    @DS(value = DataSourceType.db1)
    //@Transactional(rollbackFor = Exception.class)  // 如果需要事务，可添加
    public String getUser2() {
        return cityDb1Mapper.getNameById(1);
    }

}
