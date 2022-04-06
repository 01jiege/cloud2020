package com.atguigu.cloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String str;

    @GetMapping(value="/config/get")
    public CommonResult getConfig(){
        return new CommonResult<>(200,"success",str);
    }

}
