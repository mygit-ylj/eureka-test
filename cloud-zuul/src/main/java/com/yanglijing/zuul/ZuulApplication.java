package com.yanglijing.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

//    @Bean
//    public RateLimiterErrorHandler rateLimitErrorHandler() {
//        return new DefaultRateLimiterErrorHandler() {
//            @Override
//            public void handleSaveError(String key, Exception e) {
//                // custom code
//            }
//
//            @Override
//            public void handleFetchError(String key, Exception e) {
//                // custom code
//            }
//
//            @Override
//            public void handleError(String msg, Exception e) {
//                // custom code
//            }
//        }
//    }
}
