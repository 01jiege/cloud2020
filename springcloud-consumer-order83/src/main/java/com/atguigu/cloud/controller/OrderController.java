package com.atguigu.cloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Value("${server-url}")
    private String serverUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/order/payment/get/{id}")
    public CommonResult get(@PathVariable Long id){
        return restTemplate.getForObject(serverUrl + "/payment/get/" + id,CommonResult.class);
    }
}
