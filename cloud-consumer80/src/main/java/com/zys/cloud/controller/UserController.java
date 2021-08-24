package com.zys.cloud.controller;

import com.zys.cloud.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Resource
    private UserClient userClient;

    @GetMapping("/get")
    public String get(){
        return userClient.get();
    }

}
