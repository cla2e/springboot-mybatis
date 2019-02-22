package com.baizhi.cmfz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.baizhi.cmfz.dao")
@SpringBootApplication
public class SpringbootMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
