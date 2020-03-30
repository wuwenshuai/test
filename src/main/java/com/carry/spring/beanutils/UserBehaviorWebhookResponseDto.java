package com.carry.spring.beanutils;

import lombok.Data;
@Data
public class UserBehaviorWebhookResponseDto {

    private String id;
    private String name;
    private String clientId;
    private String time;
    private String appLaunchId;
    private String networkType;
    //pageShow
    private String currentPage; // 当前打开的页面
    private String previousPage; //前一个离开的页面
    private int previousPageDuration; // 前一个页面停留时间，单位ms
    private int sinceAppOpen;// 打开当前页面距小程序打开多久后
    private boolean isReturn;// 是不是在30s内返回后打开的第一个页面

    private String brand; //品牌
    private String model; //型号
    private String version; //微信版本号
    private String system; //操作系统及版本
    private String platform; //客户端平台

    //用户信息userInfo
    private String nickName; //用户昵称
    private String avatarUrl; //用户头像图片的 URL
    private int gender; //用户性别
    private String country; //用户所在国家
    private String province; //用户所在省

    //位置信息locationInfo
    private float latitude; //纬度
    private float longitude; //经度
    private float speed; //速度，单位 m/s
    private float accuracy; //位置的精确度
}
