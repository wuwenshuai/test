package com.carry.设计模式.建造者模式;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Product {

    private List<Map<String, Object>> wheres = new ArrayList<>();

}
