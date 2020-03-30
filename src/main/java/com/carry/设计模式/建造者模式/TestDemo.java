package com.carry.设计模式.建造者模式;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.buildWhere("ownership_type_id","=", Arrays.asList("ANDYTESTOWNERSHIP"));
        worker.buildWhere("ownership_type_id","=", Arrays.asList("ANDYTESTOWNERSHIP"));
        worker.buildSelect("total","count(distinct good_id)",null);
        worker.buildSelect("week","week(event_date)",null);
        List<Map<String, Object>> list = worker.getList();
        Map<String, Object> wheres = new HashMap<>();
        wheres.put("select", list);
        System.out.println(wheres);
    }
}
