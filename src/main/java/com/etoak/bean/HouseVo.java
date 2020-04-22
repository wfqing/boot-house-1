package com.etoak.bean;

import lombok.Data;

@Data
public class HouseVo extends House {
    // 租赁方式
    private String rentModeName;
    // 户籍名称
    private String houseTypeName;
    // 朝向名称
    private String orientationName;
}
