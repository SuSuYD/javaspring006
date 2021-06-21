package com.cold.dao;

import com.cold.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


public class UserDaoImpl implements UserDao{

    SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /**
     * statement:与要使用的语句匹配的唯一标识符。
     * @return
     */
    @Override
    public User query(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectOne("user.query",id);
    }

    @Override
    public List<User> queryByName(String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectList("user.queryByName",name);
    }

    @Override
    public void addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
    }
}
