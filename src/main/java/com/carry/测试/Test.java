package com.carry.测试;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) throws JsonProcessingException {


        OwnershipVerificationSettingDto dto = new OwnershipVerificationSettingDto();
        dto.setOwnershipVerificationField("11111");

        User user = new User();
        user.setId(1);
        user.setName("hehe");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        System.out.println(s);

        float a = 1.0f;
        float b = 0.8f;
        System.out.println(a+b);
        BigDecimal c = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal("0.9");
        BigDecimal subtract = c.subtract(d);
        System.out.println(subtract);
    }
}
