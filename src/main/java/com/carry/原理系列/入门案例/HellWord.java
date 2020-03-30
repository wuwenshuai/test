package com.carry.原理系列.入门案例;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class HellWord {

    public static void main(String[] args) {

        PasswordEncoder delegatingPasswordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encode = delegatingPasswordEncoder.encode("123");
        System.out.println(encode);

    }
}
