package com.carry.spring;

import com.carry.spring.pojo.Stu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {


        List<Stu> list = new ArrayList();
        list.add(new Stu());
         list.stream().forEach(item -> System.out.println(item.getName()));
    }
}
