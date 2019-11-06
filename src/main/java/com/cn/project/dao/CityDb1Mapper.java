package com.cn.project.dao;

import com.cn.project.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author moment
 * @date 2019/11/5 15:18
 * @describe
 */
@Mapper
public interface CityDb1Mapper {
    // 多数据源注解 @TargetDataSource 不可以在这里使用
    List<City> likeName(String name);

    City getById(int id);

    String getNameById(int id);


}
