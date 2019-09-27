package com.puqiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author PuQiong
 * @date 2019/9/26   - 16:11
 */
/*
* @SpringBootApplication 用来标注一个主程序类，说明这是一个Spring Boot应用
* */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用 启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
