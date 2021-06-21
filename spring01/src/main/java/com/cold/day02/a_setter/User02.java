package com.cold.day02.a_setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 使用构造方法构造属性
 */
public class User02 {
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

    public User02(int id, String name) {
        this.id = id;
        this.name = name;
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
