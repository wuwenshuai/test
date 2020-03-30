package com.carry.java8;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("1","2","3","4");
        stringList.stream().forEach(item -> {
            try {
                say(item);
            }catch (Exception e) {
                System.out.println("-------");
                return;
            }
        });
    }

    public static void say(String s){
        if (s.equals("1")) {
            throw new RuntimeException();
        }else {
            System.out.println(s);
        }
    }
}
