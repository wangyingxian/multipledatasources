package com.cn.project.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @author tangc
 * @date 动态切换数据源
 **/
@Order(1)
@Aspect
@Component
public class DynamicDataSourceAspect {
    private Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Before("@annotation(ds)")
    public void changeDataSource(JoinPoint point,DS ds) throws Throwable{
        DataSourceType dataSourceId = ds.value();
        if(!DatabaseContextHolder.isContainsDataSource(dataSourceId)){
            logger.info("数据源不存在（"+dataSourceId+")不存在-"+point.getSignature());
        }else{
            logger.info("使用数据源（"+dataSourceId+")-"+point.getSignature());
            DatabaseContextHolder.setDatabaseType(ds.value());
        }
    }

    @After("@annotation(ds)")
    public void resetSource(JoinPoint point,DS ds) throws Throwable{
        logger.info("恢复数据源-"+point.getSignature());
        DatabaseContextHolder.clearDatabaseType();
    }


}