package com.cn.project.config;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/4/1
 */
@Slf4j
public class DatabaseContextHolder {
    //存放线程类型信息
    private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<>();

    //存放数据源id
    public static List<String> dataSourceIds = new ArrayList<String>();

    //设置数据源
    public static void setDatabaseType(DataSourceType dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    //获取数据源
    public static DataSourceType getDatabaseType() {
        return contextHolder.get();
    }

    //清空数据源
    public static void clearDatabaseType() {
        contextHolder.remove();
    }


    //判断当前数据源是否存在
    public static boolean isContainsDataSource(DataSourceType dataSourceId) {
        return dataSourceIds.contains(dataSourceId);
    }
}