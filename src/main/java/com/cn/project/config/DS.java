package com.cn.project.config;

import java.lang.annotation.*;

/**
 * @author tangc
 * @date
 **/

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DS {
    DataSourceType value() default DataSourceType.db1;
}
