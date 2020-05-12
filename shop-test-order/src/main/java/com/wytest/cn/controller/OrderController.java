package com.wytest.cn.controller;

import com.wytest.cn.feign.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private MemberFeign memberFeign;

    @GetMapping("/getOrder")
    public String getOrder(){
        System.out.println("调用order服务");
        String member = memberFeign.getMember();
        return "调用order服务"+member;
    }
}
