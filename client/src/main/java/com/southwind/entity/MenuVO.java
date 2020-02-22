package com.southwind.entity;

import lombok.Data;

import java.util.List;


/**
 * 将数据调整为layui需要的格式
 */
@Data
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
