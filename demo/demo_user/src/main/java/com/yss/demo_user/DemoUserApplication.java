package com.yss.demo_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: LiangJianAn
 * @Description:    启动类
 * @Date: 2019/12/4 11:20
 * @Modified By：
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class DemoUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUserApplication.class, args);
    }

}
