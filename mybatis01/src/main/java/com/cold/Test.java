package com.cold;

import com.cold.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //暂时测试需要些写，后面不需要
        String path = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        //通过SqlSessionFactory得到连接,构建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //直接操作数据库
        User user = sqlSession.selectOne("user.query",25);
        System.out.println(user.getT_name());
        sqlSession.close();
    }

    @org.junit.Test
    public void queryByName() throws IOException {
        //暂时测试需要些写，后面不需要
        String path = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        //通过SqlSessionFactory得到连接,构建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //直接操作数据库
        List<User> user = sqlSession.selectList("user.queryByName","2");
        System.out.println(user);
        sqlSession.close();
    }

    @org.junit.Test
    public void addUser() throws IOException {
        //暂时测试需要些写，后面不需要
        String path = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        //通过SqlSessionFactory得到连接,构建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setT_name("啊哈哈");
        user.setT_password("123");
        int insert = sqlSession.insert("user.addUser", user);
        //插入修改语句需要提交，以后不需要写，因为是测试方法
        sqlSession.commit();
        sqlSession.close();
    }

    @org.junit.Test
    /**
     * 返回用户id
     */
    public void addUser2() throws IOException {
        //暂时测试需要些写，后面不需要
        String path = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        //通过SqlSessionFactory得到连接,构建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setT_name("啊哈哈");
        user.setT_password("123");
        int insert = sqlSession.insert("user.addUser2", user);
        System.out.println(user);
        System.out.println(user.getT_id());
        //插入修改语句需要提交，以后不需要写，因为是测试方法
        sqlSession.commit();
        sqlSession.close();
    }
}
