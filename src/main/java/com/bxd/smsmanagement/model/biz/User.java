package com.bxd.smsmanagement.model.biz;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

/**
 * Description: TODO
 * Package: com.bxd.smsmanagement.model.biz
 *
 * @author Leeves
 * @date 2018-03-28
 */

public class User {

    /** 用户名 */
    @ApiModelProperty(value = "用户名")
    @NotNull(message = "用户名不能为空")
    private String userName;

    /** 密码 */
    @ApiModelProperty(value = "密码")
    @NotNull(message = "密码不能为空")
    private String userPwd;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
