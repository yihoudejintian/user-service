package com.gupaoedu.user.dto;

import com.gupaoedu.user.abs.AbstractResponse;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:48
 */
public class UserLoginResponse extends AbstractResponse {

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private String avatar;

    private String mobile;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
