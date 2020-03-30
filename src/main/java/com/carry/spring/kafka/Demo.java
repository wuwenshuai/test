package com.carry.spring.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

    public static void main(String[] args) throws JsonProcessingException {


        MessageWrapper messageWrapper =new MessageWrapper();
        SynBannerMessage synBannerMessage = new SynBannerMessage();
        synBannerMessage.setMsg("1111");
        messageWrapper.setData(synBannerMessage);
        messageWrapper.setUuid("222222");

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(messageWrapper);
        System.out.println(s);

    }
}
