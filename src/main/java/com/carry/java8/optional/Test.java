package com.carry.java8.optional;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Optional<String> optionalPage = Optional.ofNullable(null);
        String s = optionalPage.orElse(null);
        System.out.println(s);
    }
}
