package com.etoak.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class HouseVo extends House {
    // 租赁方式
    private String rentModeName;
    // 户籍名称
    private String houseTypeName;
    // 朝向名称
    private String orientationName;

    // 接受前端的户型参数
    @JsonIgnore
    private String[] houseTypeList;

    // 接受前端的朝向参数
    @JsonIgnore
    private List<String> orientationList;

    @JsonIgnore
    List<Map<String,Integer>> rentalMapList;
}
