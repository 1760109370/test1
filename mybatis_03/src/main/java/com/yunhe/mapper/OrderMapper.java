package com.yunhe.mapper;

import com.yunhe.enity.Orders;

import java.util.List;

public interface OrderMapper {
    Orders selectByOneToOne(Integer id);
}
