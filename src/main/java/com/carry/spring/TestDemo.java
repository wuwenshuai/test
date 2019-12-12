package com.carry.spring;


import com.carry.spring.pojo.User;
import org.apache.commons.lang3.math.NumberUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TestDemo {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1"," ");
        System.out.println(map.get(1));

        List<String> a = Arrays.asList("1","2","3","4","5");
        List<String> b = Arrays.asList("1","2","3");
        System.out.println(a.containsAll(b));



        String today = "2019-11-18";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(today);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);

        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
