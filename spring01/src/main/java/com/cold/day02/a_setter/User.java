package com.cold.day02.a_setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String name;
    //集合
    private List list;
    //数组
    private String[] sts;
    //键值对
    private Map map;
    //聚合类
    private UserVo userVo;

    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String[] getSts() {
        return sts;
    }

    public void setSts(String[] sts) {
        this.sts = sts;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                ", sts=" + Arrays.toString(sts) +
                ", map=" + map +
                '}';
    }
}
