package com.yss.demo_user.controller;

import com.yss.demo_user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangJianAn
 * @Description:    用户controller
 * @Date: 2019/12/4 9:49
 * @Modified By：
 */
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String buyTicket(@PathVariable String username) {
        return userFeignClient.buyTicket(username);
    }
}
