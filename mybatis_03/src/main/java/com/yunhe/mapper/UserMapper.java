package com.yunhe.mapper;

import com.yunhe.enity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectByOne(Integer id);
}
