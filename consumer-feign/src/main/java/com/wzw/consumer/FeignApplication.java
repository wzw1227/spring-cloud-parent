package com.wzw.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.wzw.consumer.client") 	//feign接口的地址（client目录）
public class FeignApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignApplication.class);
    }
}