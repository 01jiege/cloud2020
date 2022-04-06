package com.atguigu.cloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult get(@PathVariable Long id){

        return new CommonResult(200,"success","service message: port-" +port +" id-"+id);

    }
}
