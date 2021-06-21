package com.cold.day02.d_custom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@JDBCConfig(url="jdbc:mysql://localhost:3306/jdbc005",userName = "root",password = "123456")
public class DBUtil {
    //通过静态方法，加入驱动
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        Connection connection;
        //.class 获得类的类对象，类的类对象里包含类的一些信息，比如属性、方法
        JDBCConfig annotation = DBUtil.class.getAnnotation(JDBCConfig.class);
        String url = annotation.url();
        String userName = annotation.userName();
        String password = annotation.password();
        connection = DriverManager.getConnection(url,userName,password);
        return connection;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(DBUtil.getConnection());
    }
}
