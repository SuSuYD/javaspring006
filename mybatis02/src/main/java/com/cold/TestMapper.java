package com.cold;

import com.cold.entity.User;
import com.cold.entity.UserVo;
import com.cold.entity.UserVo2;
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

public class TestMapper {
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
    public void query(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User query = mapper.queryById(10);
        //System.out.println(query);
        System.out.println(query.gettName());
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser("1234", "4123");
        sqlSession.commit();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryById(40);
        user.settName("已改222");
        int i = mapper.updateUser(user);
        sqlSession.commit();
        System.out.println(i);
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(38);
        sqlSession.commit();
        System.out.println("删除成功"+i+"条数据");
    }

    @Test
    public void queryByName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryByName("2");
        for (User list:users){
            System.out.println(list);
        }
    }
    @Test
    public void queryByName2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.settId(25);
        UserVo userVo = new UserVo();
        userVo.setName("2");
        userVo.setUser(user);
        List<User> users = mapper.queryByName2(userVo);
        System.out.println("查询完成");
        for (User u:users){
            System.out.println(users);
        }
    }

    @Test
    public void queryByOrder(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserVo2> userVo2s = mapper.queryByOrder();
        for (UserVo2 u:userVo2s){
            System.out.println(u);
        }
    }

    @Test
    public void queryByOrder2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserVo2> userVo2s = mapper.queryByOrder2();
        for (UserVo2 u:userVo2s){
            System.out.println(u);
        }
    }

    @Test
    public void queryForSql(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        //user.settId(10);
        user.settName("2");
        List<User> users = mapper.queryForSql(user);
        System.out.println("成功"+user.toString());
        for (User u:users){
            System.out.println(u);
        }
    }

    @Test
    public void updUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.settId(9);
        user.settName("动态1");
        user.settPassword("696969");
        mapper.updUser(user);
        sqlSession.commit();
    }
}
