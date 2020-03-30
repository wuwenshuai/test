package com.carry;

import com.carry.spring.pojo.User;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTest1 {
    public static final String DATE_RANGE_QUERY_STRING1 = "{\"fieldName\": \"status\",\"option\": \"in\",\"values\": %s";
    public static final String STATUS_FORMART = "{\"fieldName\": \"status\",\"option\": \"in\",\"values\": [\"1\",\"4\",\"5\"]}";

    public static void main(String[] args) {


        User user = null;
        if ((user = new User("1", "2")) != null && false) {

            System.out.println(1);
        }
        System.out.println(user);
        List<String> statusIds = Arrays.asList("\"1\"","\"4\"","\"5\"");

        System.out.println(STATUS_FORMART);

        String collect = statusIds.stream()//
                .collect(Collectors.joining("\",\"", "{\"fieldName\": \"status\",\"option\": \"=\",\"values\": [\"", "\"]}"));
        System.out.println(collect);
        String a = "09";
        System.out.println(objToNumber(a));

    }

    public static Number objToNumber(Object val) {
        if (val == null) {
            return 0;
        }
        String valStr = String.valueOf(val);
       // String valStr = org.springframework.util.StringUtils.trimLeadingCharacter(String.valueOf(val), '0');
        if (!NumberUtils.isNumber(valStr)) {
            return 0;
        }
        return NumberUtils.createNumber(valStr);
    }
}
