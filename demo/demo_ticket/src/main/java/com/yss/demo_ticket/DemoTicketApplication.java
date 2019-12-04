package com.yss.demo_ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangJianAn
 * @Description:    买票微服务启动类，controller
 * @Date: 2019/12/4 8:49
 * @Modified By：
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class DemoTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTicketApplication.class, args);
    }

    @RequestMapping(value = "/buyTicket/{name}",method = RequestMethod.GET)
    public String buyTicket(@PathVariable String name) {
        return name + "买票";
    }
}
