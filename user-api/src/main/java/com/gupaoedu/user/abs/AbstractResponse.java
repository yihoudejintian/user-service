package com.gupaoedu.user.abs;

import java.io.Serializable;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:48
 */
public abstract class AbstractResponse implements Serializable{

    private static final long serialVersionUID = 2703265638347739069L;
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
