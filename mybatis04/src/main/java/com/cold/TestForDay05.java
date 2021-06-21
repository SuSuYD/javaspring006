package com.cold;

import com.cold.entity.OrdersEntity;
import com.cold.entity.UserEntity;
import com.cold.mapper.OrderMapper;
import com.cold.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestForDay05 {
    //解析配置文件
    SqlSessionFactory sqlSessionFactory = null;
    /**
     * before 注解，在代码执行前进行操作
     */
    @Before
    public void getSqlSessionFactory() throws IOException {
        String path = "SqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        //通过SqlSessionFactory得到连接,构建工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @Test
    public void queryOrderAndUserLazyLoading(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersEntity> ordersEntities = mapper.queryOrderAndUserLazyLoading();
        for (OrdersEntity ordersEntity:ordersEntities){
            System.out.println(ordersEntity.getId());
            System.out.println(ordersEntity.getDescriber());
            System.out.println(ordersEntity.getUserEntity());
            System.out.println(ordersEntity.getUserEntity().getAddress());
        }
        sqlSession.close();

    }

    /*一级缓存*/
    @Test
    public void level1Cache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //第一次查询
        UserEntity userEntity = mapper.queryById(1001);
        System.out.println(userEntity);
        //第二次查询
        UserEntity userEntity1 = mapper.queryById(1001);
        System.out.println(userEntity1);
        //第三次查询
        UserEntity userEntity2 = mapper.queryById(1001);
        System.out.println(userEntity2);
    }

    @Test
    public void level1Cache2(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);
        //第一次查询
        UserEntity userEntity = mapper1.queryById(1001);
        System.out.println(userEntity);
        //第二次查询
        UserEntity userEntity1 = mapper1.queryById(1001);
        System.out.println(userEntity1);
        //第三次查询
        UserEntity userEntity2 = mapper2.queryById(1001);
        System.out.println(userEntity2);
    }
    @Test
    public void level1Cache3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setTid(1007);
        userEntity.setUname("1007222");
        //第一次查询
        UserEntity userEntity1 = mapper.queryById(1001);
        System.out.println(userEntity1);
        //第二次查询
        UserEntity userEntity2 = mapper.queryById(1001);
        System.out.println(userEntity2);
        //插入语句
        mapper.addUser(userEntity);
        sqlSession.commit();
        //第三次查询
        UserEntity userEntity3 = mapper.queryById(1001);
        System.out.println(userEntity3);

    }
}
