package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableEurekaClient
public class provideruser {
    public static void main(String[] args) {

        SpringApplication.run(provideruser.class);
        System.out.println("Hello World!");
    }
}
