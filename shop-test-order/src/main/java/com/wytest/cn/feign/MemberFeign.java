package com.wytest.cn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "member",fallback =MemberHystrix.class)
public interface MemberFeign {

    @GetMapping("/getMember")
    String getMember();
}


