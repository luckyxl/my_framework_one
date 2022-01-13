package com.xl.my_framework_one.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum Sex implements BaseEnum<Integer>{

    Man(0, "男"),
    Woman(1, "女"),


    ;

    private Integer value;

    private String label;


    Sex(Integer value, String label) {
        this.value = value;
        this.label = label;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

}
