package com.carry.设计模式.建造者模式;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Worker extends Builder {

   private List<Map<String,Object>> list = new ArrayList<>();

    @Override
    Map<String, Object> buildSelect(String fieldName,String expression,Object value) {
        Map<String, Object> map = buildSelectMap(fieldName, expression, value);
        list.add(map);
        return map;
    }

    @Override
    Map<String, Object> buildWhere(String fieldName, String option, Object value) {
        Map<String, Object> map = buildWhereMap(fieldName, option, value);
        list.add(map);
        return map;
    }

    @Override
    Map<String, Object> buildGroup(String fieldName,String expression, Object value) {
        Map<String, Object> map = buildGrouptMap(fieldName, expression, value);
        list.add(map);
        return map;
    }

    @Override
    List<Map<String, Object>> getList() {
        return list;
    }

    private static Map<String, Object> buildWhereMap(String fieldName, String option, Object value) {
        Map<String, Object> whereComp = new HashMap<>();
        whereComp.put("fieldName", fieldName);
        whereComp.put("option", option);
        whereComp.put("values", Arrays.asList(value));
        return whereComp;
    }

    private static Map<String, Object> buildSelectMap(String fieldName, String expression, Object value) {
        Map<String, Object> selectMap = new HashMap<>();
        selectMap.put("fieldName", fieldName);
        if (StringUtils.isNotBlank(expression)) {
            selectMap.put("expression",expression);
        }
        return selectMap;
    }

    private static Map<String, Object> buildGrouptMap(String fieldName, String expression, Object value) {
        Map<String, Object> selectMap = new HashMap<>();
        selectMap.put("fieldName", fieldName);
        if (StringUtils.isNotBlank(expression)) {
            selectMap.put("expression",expression);
        }
        return selectMap;
    }

}
