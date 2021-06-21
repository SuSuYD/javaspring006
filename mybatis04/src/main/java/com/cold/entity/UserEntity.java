package com.cold.entity;

import java.util.Date;
import java.util.List;

public class UserEntity {
    private Integer tid;
    private String uname;
    private Date birthday;
    private String sex;
    private String address;
    //订单列表
    private List<OrdersEntity> ordersEntityList;

    public List<OrdersEntity> getOrdersEntityList() {
        return ordersEntityList;
    }

    public void setOrdersEntityList(List<OrdersEntity> ordersEntityList) {
        this.ordersEntityList = ordersEntityList;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "tid=" + tid +
                ", uname='" + uname + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", ordersEntityList=" + ordersEntityList +
                '}';
    }
}
