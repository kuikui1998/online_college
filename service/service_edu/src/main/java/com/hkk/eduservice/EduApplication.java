package com.hkk.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @auther kuikui
 * @create 2020-09-07 15:49
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hkk","com.hkk.servicebase.config","com.hkk.servicebase.handler"})
public class EduApplication {
    public static void main(String[] args) {
            SpringApplication.run(EduApplication.class,args);
        }
}
