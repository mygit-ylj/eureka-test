package com.ylj.order.feign;


import com.ylj.order.feign.imp.UserServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "goods-service",fallbackFactory = UserServiceFallbackFactory.class)
@RequestMapping("/goods")
public interface GoodsServiceFeign {
    @RequestMapping("/detail")   //相当于  知道了接口请求路径
    public String selectNameById(@RequestParam("id") Integer userId);// 相当于  知道了接口请求参数
    //  返回值类型
}
