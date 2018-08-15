package com.gupaoedu.user.dal.persistence;

import com.gupaoedu.user.dal.entity.User;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:52
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户
     * @return
     */
    User getUserByUserName(String  userName);
}
