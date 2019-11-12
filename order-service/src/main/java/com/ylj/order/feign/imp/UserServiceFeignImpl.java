package com.ylj.order.feign.imp;

import com.ylj.order.feign.UserServicceFeign;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/order/ylj")
public class UserServiceFeignImpl implements UserServicceFeign {
    @Override
    public String selectNameById(Integer userId) {
        return "用户查询异常";
    }
}
