package com.hkk.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @auther kuikui
 * @create 2020-09-21 11:07
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.hkk"})
public class OssApplication {
    public static void main(String[] args) {
            SpringApplication.run(OssApplication.class,args);
        }
}
