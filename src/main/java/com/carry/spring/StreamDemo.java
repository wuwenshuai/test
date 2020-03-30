package com.carry.spring;

import com.carry.spring.pojo.Stu;
import com.carry.spring.pojo.User;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<User> listfiter = new ArrayList<>();
        listfiter.add(new User("wu0","2"));
        listfiter.add(new User("wu1","3"));
        listfiter.add(new User("wu2","4"));
        listfiter.add(new User("wu3","4"));
        listfiter.stream().distinct().forEach(item -> item.getId());
        System.out.println(listfiter);

        //根据userid去重

        Map<String, User> collect = listfiter.stream().collect(Collectors.toMap(User::getId, item -> item,(v1, v2) -> v1));
        System.out.println(collect);

        List<String> list  = Arrays.asList("1","2");
        List<String> list1 = new ArrayList<>();
        boolean b = list1.containsAll(list);
        System.out.println(b);
        DateTimeFormatter ISOFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneId.of("Z"));
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = zonedDateTime.minusMinutes(15);
        boolean after = zonedDateTime.isAfter(zonedDateTime1);
        System.out.println(after);
        String format = zonedDateTime1.format(ISOFormatter);
        System.out.println(format);
       /* ZonedDateTime zonedDateTime1 = zonedDateTime.minusMinutes(1);
        int hour = zonedDateTime1.getHour();
        int minute = zonedDateTime1.getMinute();
        System.out.println(minute);
        System.out.println(hour);
        System.out.println(hour+":"+minute);*/
    }
}
