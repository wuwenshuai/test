package com.carry.枚举;

import org.apache.commons.lang3.EnumUtils;

import java.util.Map;

public class Test {

    public static void main(String[] args) {


        String value = OrderStatus.values()[2].name();
        System.out.println(value);
    }
}
