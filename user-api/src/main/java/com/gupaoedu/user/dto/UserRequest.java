package com.gupaoedu.user.dto;

import java.io.Serializable;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:47
 */
public class UserRequest implements Serializable {

    private static final long serialVersionUID = 6680985894959077736L;
    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
