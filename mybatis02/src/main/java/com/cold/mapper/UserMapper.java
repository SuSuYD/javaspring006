package com.cold.mapper;

import com.cold.entity.User;
import com.cold.entity.UserVo;
import com.cold.entity.UserVo2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     *根据id查询
     */
    User queryById(int id);

    /**
     *模糊查询
     */
    List<User> queryByName(String name);

    /**
     *新增
     */
    //不写parameterType，而是使用注解的方式传参@Param
    //配置文件#中的名字要和注解里的名字对应
    void addUser(@Param("t_name")String name,@Param("t_password")String password);
    /**
     * 修改
     */
    int updateUser(User user);
    /**
     * 删除
     */
    int deleteUser(int id);

    /**
     *输入映射
     */
    List<User> queryByName2(UserVo userVo);

    /**
     * 输出映射
     */
    List<UserVo2> queryByOrder();
    /**
     * 输出映射,resultMapper映射方式
     */
    List<UserVo2> queryByOrder2();

    List<User> queryForSql(User user);

    void updUser(User user);
}
