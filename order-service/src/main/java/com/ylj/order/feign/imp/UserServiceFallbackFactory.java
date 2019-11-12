package com.ylj.order.feign.imp;

import com.ylj.order.feign.UserServicceFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserServicceFeign> {
    @Override
    public UserServicceFeign create(Throwable throwable) {
        RuntimeException re =  (RuntimeException)throwable;
        System.out.println("捕获到不可用的原因:");
        re.printStackTrace();

        return new UserServiceFeignImpl();
    }
}
