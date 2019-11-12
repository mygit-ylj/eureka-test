package com.yanglijing.orderservice.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-service")
@RequestMapping("/user")
public interface FeignUserService {

    @RequestMapping("/detail")
    public String selectNameById(@RequestParam("id") Integer userId);
}
