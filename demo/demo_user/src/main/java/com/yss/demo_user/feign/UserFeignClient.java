package com.yss.demo_user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: LiangJianAn
 * @Description:    调用买票微服务
 * @Date: 2019/12/4 10:51
 * @Modified By：
 */
@FeignClient(name = "demo-ticket")
public interface UserFeignClient {

    @RequestMapping(value = "/buyTicket/{name}" )
    public String buyTicket(@PathVariable String name);
}
