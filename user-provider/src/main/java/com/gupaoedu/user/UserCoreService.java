package com.gupaoedu.user;

import com.gupaoedu.user.dal.entity.User;
import com.gupaoedu.user.dal.persistence.UserMapper;
import com.gupaoedu.user.dto.UserLoginResponse;
import com.gupaoedu.user.dto.UserRequest;
import com.gupaoedu.user.exception.ExceptionUtil;
import com.gupaoedu.user.exception.ServiceException;
import com.gupaoedu.user.exception.ValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:50
 */
//@Service("userCoreService")
public class UserCoreService implements IUserCoreService {

    Logger logger = LoggerFactory.getLogger(UserCoreService.class);

    @Autowired
    UserMapper userMapper;

    @Override
    public UserLoginResponse login(UserRequest request) {
        UserLoginResponse response = new UserLoginResponse();
        try {
            beforeValidate(request);

            User user = userMapper.getUserByUserName(request.getUserName());
            if(user == null || !user.getPassword().equals(request.getPassword())){
                response.setCode(ResponseCodeEnum.USERPASSWORD_ERROR.getCode());
                response.setMessage(ResponseCodeEnum.USERPASSWORD_ERROR.getMsg());
                return response;
            }
            response.setUserId(user.getId());
            response.setAvatar(user.getAvatar());
            response.setCode(ResponseCodeEnum.SUCCESS.getCode());
            response.setMessage(ResponseCodeEnum.SUCCESS.getMsg());

            return response;

        }catch (Exception e){
            ServiceException exception = (ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(exception.getErrorCode());
            response.setMessage(exception.getErrorMessage());
        }finally {
            logger.info(response.toString());
        }
        return response;
    }

    private void beforeValidate(UserRequest request){
        if(request == null){
            throw new ValidateException("请求不能空");
        }
        if(StringUtils.isEmpty(request.getUserName())){
            throw new ValidateException("用户名不能为空");
        }
        if(StringUtils.isEmpty(request.getPassword())){
            throw new ValidateException("密码不能为空");
        }
    }
}
