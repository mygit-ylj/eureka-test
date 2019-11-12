package com.yanglijing.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/detail")
    public String selectNameById(@RequestParam("id") Integer userId){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三  8084");
        map.put(2,"李四  8084");
        map.put(3,"王五  8084");

        return map.get(userId);
    }
}
