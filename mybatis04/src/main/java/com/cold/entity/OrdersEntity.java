package com.cold.entity;

import java.util.Date;
import java.util.List;

public class OrdersEntity {
    private Integer id;
    private String orderNumber;
    private Date createtime;
    private String describer;
    private Integer userId;
    //一对一关系，需要什么表信息，就写表对应的entity
    private UserEntity userEntity;
    //一对多关系，写 List
    private List<OrderdatailEntity> orderdatailEntities;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<OrderdatailEntity> getOrderdatailEntities() {
        return orderdatailEntities;
    }

    public void setOrderdatailEntities(List<OrderdatailEntity> orderdatailEntities) {
        this.orderdatailEntities = orderdatailEntities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescriber() {
        return describer;
    }

    public void setDescriber(String describer) {
        this.describer = describer;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", createtime=" + createtime +
                ", describer='" + describer + '\'' +
                ", userId=" + userId +
                '}';
    }
}
