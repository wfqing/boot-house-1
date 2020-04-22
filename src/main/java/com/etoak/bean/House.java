package com.etoak.bean;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class House {
    private Integer id;
    @NotNull(message = "省份必填")
    private Integer province;
    @NotNull(message = "市区必填")
    private Integer city;
    @NotNull(message = "区县必填")
    private Integer area;
    private String areaName; // 所在区县名称
    @NotNull(message = "租赁方式必填")
    @NotBlank(message = "租赁方式不能为空")
    private String rentMode; // 租赁方式
    private String orientation; // 朝向
    private String houseType; // 户型
    @NotNull(message = "租金必填")
    @Max(value = 100000,message = "租金最大不能超过10万")
    @Min(value = 100 , message = "租金不能小于100")
    private Integer rental; // 租金
    @NotNull(message = "地址必填")
    @Size(min = 1,max = 10,message = "地址长度介于1到10之间")
    private String address; // 地址
    private String pic; // 图片
    private String publishTime; // 时间

}
