package com.cn.project.service;

import com.cn.project.config.DS;
import com.cn.project.config.DataSourceType;
import com.cn.project.dao.CityDb1Mapper;
import com.cn.project.dao.CityDb2Mapper;
import com.cn.project.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author moment
 * @date 2019/11/5 15:17
 * @describe
 */
@Service
public class CityDb2Service {
    @Autowired
    private CityDb2Mapper cityDb2Mapper;

    public City getUser(int id) {
        return cityDb2Mapper.getById(id);
    }

    @DS(value = DataSourceType.db2)
    //@Transactional(rollbackFor = Exception.class)  // 如果需要事务，可添加
    public String getUser2() {
        return cityDb2Mapper.getNameById(1);
    }

}
