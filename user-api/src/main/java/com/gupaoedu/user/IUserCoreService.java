package com.gupaoedu.user;

import com.gupaoedu.user.dto.UserLoginResponse;
import com.gupaoedu.user.dto.UserRequest;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:47
 * 用户接口的定义
 */
public interface IUserCoreService {

    /**
     * 用户登录
     * 这里一般情况是传用户名密码，但是dto就是封装一层进行对象传递
     */
    UserLoginResponse login(UserRequest request);

}
