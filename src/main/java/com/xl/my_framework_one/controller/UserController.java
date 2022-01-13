package com.xl.my_framework_one.controller;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xl.my_framework_one.enums.Sex;
import com.xl.my_framework_one.mapper.UserMapper;
import com.xl.my_framework_one.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping
    public void save(@RequestBody User user) {
        userMapper.insert(user);
    }



    @GetMapping("{id}")
    public User get(@PathVariable("id") Long id) {
        return userMapper.selectById(id);
    }


    @GetMapping()
    public List<User> get() {
        return userMapper.selectList(new QueryWrapper<>());
    }



}
