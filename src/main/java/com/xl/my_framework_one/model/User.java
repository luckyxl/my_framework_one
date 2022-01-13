package com.xl.my_framework_one.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xl.my_framework_one.enums.Sex;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("user")
public class User implements Serializable {
    private static final long serialVersionUID = -9055289731628591514L;
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String name;


    private Integer age;


    private Sex sex;
}
