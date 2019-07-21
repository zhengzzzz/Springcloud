package com.qianfeng.Controller;


import com.qianfeng.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    public RestTemplate restTemplate;


    public final String url = "http://localhost:7900/user/";

    @GetMapping("/order/{id}")
    public user getorder(@PathVariable Long id) {

        user forObject = restTemplate.getForObject(url + id, user.class);
        return forObject;
    }

}
