package com.carry.spring.beanutils;

import org.apache.commons.beanutils.BeanUtils;
//import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        UserBehaviorDto userBehaviorDto = new UserBehaviorDto();
        userBehaviorDto.setId("111");
        Map<String,Object> userInfo = new HashMap<>();
        userInfo.put("nickName","hehe");
        userInfo.put("gender",1);
        userBehaviorDto.setUserInfo(userInfo);
        UserBehaviorWebhookResponseDto userBehaviorWebhookResponseDto = new UserBehaviorWebhookResponseDto();
       // BeanUtils.copyProperties(userBehaviorDto,userBehaviorWebhookResponseDto);
      //  BeanUtils
        System.out.println(userBehaviorWebhookResponseDto);

    }
}
