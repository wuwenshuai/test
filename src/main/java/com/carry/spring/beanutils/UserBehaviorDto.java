package com.carry.spring.beanutils;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class UserBehaviorDto {

    private String id;

    private String name;

    private String clientId;

    private Object param;

    private String time;

    private String appLaunchId;

    private String networkType;

    private Map<String, Object> appShow;

    private Map<String, Object> pageShow;

    private Map<String, Object> systemInfo;

    private Map<String, Object> userInfo;

    private Map<String, Object> locationInfo;
}
