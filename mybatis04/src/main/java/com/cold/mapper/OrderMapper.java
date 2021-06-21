package com.cold.mapper;

import com.cold.entity.OrderVo;
import com.cold.entity.OrdersEntity;


import java.util.List;

public interface OrderMapper {
    //1、查询订单表，关联查询订单表里面绑定的用户信息 resultType
    List<OrderVo> queryOrderAndUserByType();
    //1、查询订单表，关联查询订单表里面绑定的用户信息 resultMap
    List<OrdersEntity> queryOrderAndUserByMap();
    //2、查询订单信息和订单明细信息
    List<OrdersEntity> queryOrderDetail();

    List<OrdersEntity> queryOrderAndUserLazyLoading();

}
