package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value ="/get/{id}")
    public CommonResult getByID(int id){
        log.info("消费查询");
        return restTemplate.getForObject("http://localhost:8001/payment/get/1",CommonResult.class);
    }



}
