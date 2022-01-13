package com.xl.my_framework_one;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.xl.my_framework_one.mapper")
public class MyFrameworkOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFrameworkOneApplication.class, args);
    }

}
