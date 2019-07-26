package com.qianfeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//将当前项目标记为eureka servver
public class EurekaApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class);
    }

}
