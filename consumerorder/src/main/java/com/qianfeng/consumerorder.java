package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class consumerorder {

    @Bean//相当于XML中的bean标签
    public RestTemplate getTemp() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(consumerorder.class, args);

    }

}
