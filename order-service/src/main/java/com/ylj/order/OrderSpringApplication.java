package com.ylj.order;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import com.ylj.order.feignConf.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
//@EnableEurekaClient
@SpringBootApplication
//@EnableHystrix
//@RibbonClient(name = "user-service",configuration = MySelfRule.class)
public class OrderSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringApplication.class,args);
    }

 /*  @Bean
   @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

   @Bean
    public IRule myRule(){
        return new WeightedResponseTimeRule();
    }*/
}
