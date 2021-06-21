package com.cold;

import com.cold.dao.UserDao;
import com.cold.dao.UserDaoImpl;
import com.cold.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TsetDao {
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
    public void query(){
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User query = userDao.query(10);
        System.out.println(query.getT_name());
    }
}
