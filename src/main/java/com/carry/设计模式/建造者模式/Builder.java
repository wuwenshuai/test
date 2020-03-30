package com.carry.设计模式.建造者模式;

import java.util.List;
import java.util.Map;

public abstract class Builder {
    abstract Map<String, Object> buildSelect(String fieldName, String expression, Object value);

    abstract Map<String, Object> buildWhere(String fieldName, String option, Object value);

    abstract Map<String, Object> buildGroup(String fieldName, String expression,Object value);

    abstract List<Map<String, Object>> getList();
}
