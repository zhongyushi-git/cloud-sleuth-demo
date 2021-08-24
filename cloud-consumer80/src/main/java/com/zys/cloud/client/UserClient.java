package com.zys.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//指定微服务名称
@FeignClient(value = "cloud-provider")
public interface UserClient {

    @GetMapping("/user/get")
    String get();
}