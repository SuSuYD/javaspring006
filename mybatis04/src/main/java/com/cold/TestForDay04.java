package com.cold;

import com.cold.entity.OrderVo;
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

public class TestForDay04 {
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
    public void queryOrderAndUserByType(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderVo> orderVos = mapper.queryOrderAndUserByType();
        for (OrderVo orderVo : orderVos) {
            System.out.println(orderVo);
        }
        sqlSession.close();
    }

    @Test
    public void queryOrderAndUserByMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersEntity> ordersEntities = mapper.queryOrderAndUserByMap();
        for (OrdersEntity ordersEntity : ordersEntities) {
            System.out.println(ordersEntity);
            System.out.println(ordersEntity.getUserEntity().getTid());
        }

        sqlSession.close();
    }

    @Test
    public void queryOrderDetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersEntity> ordersEntities = mapper.queryOrderDetail();
        for (OrdersEntity ordersEntity : ordersEntities) {
            System.out.println(ordersEntity);
        }
    }

//3.查询用户信息及用户购买的商品信息
    @Test
    public void queryUserAndProduct(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserEntity> userEntities = mapper.queryUserAndProduct();
        sqlSession.close();
    }
}
