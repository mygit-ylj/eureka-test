package com.ylj.order.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
@FeignClient(name = "user-service")
public interface UserServicceFeign {

    @RequestMapping("/detail")
    public String selectNameById(@RequestParam("id") Integer userId);
}
