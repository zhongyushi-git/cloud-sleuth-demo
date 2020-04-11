package com.zys.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/consumer")
public class UserController {
    private final  String BASE_URL="http://cloud-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String get(){
        return restTemplate.getForObject(BASE_URL+"/user/get",String.class);
    }


}
