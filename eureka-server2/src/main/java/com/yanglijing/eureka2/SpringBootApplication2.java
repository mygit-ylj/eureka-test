package com.yanglijing.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication2.class,args);
    }
}
