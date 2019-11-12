package com.yanglijing.orderservice.controller;

import com.yanglijing.orderservice.feign.FeignUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    FeignUserService feignUserService;

    public String selectNameById(@PathVariable("id") Integer userId){
        String username = feignUserService.selectNameById(userId);
        return "这是"+username+"的订单";
    }

}
