package com.qianfeng.controller.Springcloud.Controller;

import com.qianfeng.pojo.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("/user/{id}")
    public user getuser(@PathVariable Long id) {

        return new user(id);
    }


}
