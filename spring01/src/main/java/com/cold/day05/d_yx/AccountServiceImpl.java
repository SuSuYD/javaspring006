package com.cold.day05.d_yx;

import org.springframework.transaction.annotation.Transactional;

/**
 * 在新的 spring 版本中，只要配置了自动事务管理就不需要这个注解，可加可不加
 */
@Transactional
public class AccountServiceImpl implements AccountService {
    //把dao注入进来
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inter, Integer money) {
        accountDao.out(outer,money);
        //模拟服务器崩溃
        int i = 1/0;
        accountDao.in(inter,money);
    }
}
