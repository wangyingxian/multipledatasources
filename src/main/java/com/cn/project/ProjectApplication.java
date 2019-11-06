package com.cn.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class ProjectApplication {
    protected final static Logger logger = LoggerFactory.getLogger(ProjectApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
        logger.info("application is run success");
    }

}
