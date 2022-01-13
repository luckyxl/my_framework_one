package com.xl.my_framework_one.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

public interface BaseEnum<T> extends IEnum {



    String getLabel();

    String name();
}
