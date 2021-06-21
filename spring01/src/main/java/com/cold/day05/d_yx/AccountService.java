package com.cold.day05.d_yx;

/**
 * 业务层 转账
 */
public interface AccountService {
    void transfer(String outer,String inter,Integer money);
}
