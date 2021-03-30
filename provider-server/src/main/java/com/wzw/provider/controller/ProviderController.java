package com.wzw.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @Value("${server.port}")
    String port;
    @RequestMapping("get")
    public String getData(){
        return "端口"+port+":提供了数据";
    }
}
