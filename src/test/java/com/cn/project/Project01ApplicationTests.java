package com.cn.project;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Project01ApplicationTests {
  private Logger logger= LoggerFactory.getLogger(Project01ApplicationTests.class);


    @Test
    void contextLoads() throws SQLException {

    }

}
