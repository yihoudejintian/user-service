package com.gupaoedu.user.dal.entity;

/**
 * @author yuantongqin
 * @date 2018/7/20 下午5:52
 */
public class User {

    private Integer id;
    private String username;//'用户名（登录）',
    private String password;//'密码（登录）',
    private String realname;//'真实姓名',
    private String avatar;//'头像',
    private String mobile;//'手机号',
    private String sex;
    private Integer status;//'状态（1正常，2冻结）',
    private String create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public User(Integer id, String username, String password, String realname, String avatar, String mobile, String sex, Integer status, String create_time) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.avatar = avatar;
        this.mobile = mobile;
        this.sex = sex;
        this.status = status;
        this.create_time = create_time;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sex='" + sex + '\'' +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                '}';
    }
}
