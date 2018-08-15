package com.gupaoedu.user;

/**
 * @author yuantongqin
 * @date 2018/8/15 下午4:36
 * 状态的统一管理
 */
public enum ResponseCodeEnum {
    USERPASSWORD_ERROR("001001","用户名或密码不存在"),
    SUCCESS("001002","成功"),
    SYS_PARAM_NOT_RIGHT("001003","参数错误"),
    SYSTEM_BUSY("001099","系统异常，请稍后再试");
    private final String code;
    private final String msg;

    ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
