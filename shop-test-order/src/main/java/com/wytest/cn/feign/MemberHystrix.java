package com.wytest.cn.feign;

import org.springframework.stereotype.Component;

@Component
public class MemberHystrix implements MemberFeign{
    @Override
    public String getMember() {
        System.out.println("MemberFeign报错了");
        return "sorry,报错了";
    }
}
