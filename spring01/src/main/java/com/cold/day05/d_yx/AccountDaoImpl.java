package com.cold.day05.d_yx;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 数据访问层  转账的方法
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, Integer money) {
        String sql = "update Account set 金额 = 金额-? where 姓名 = ?";
        this.getJdbcTemplate().update(sql,money,outer);
    }

    @Override
    public void in(String inter, Integer money) {
        String sql = "update Account set 金额 = 金额+? where 姓名 = ?";
        this.getJdbcTemplate().update(sql,money,inter);
    }
}
