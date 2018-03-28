package com.bxd.smsmanagement.model.biz;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModelProperty;

/**
 * Description: TODO
 * Package: com.bxd.smsmanagement.model.biz
 *
 * @author Leeves
 * @date 2018-03-28
 */

public class UserInfo extends User{

    /** 机构 */
    @ApiModelProperty(value = "机构")
    @NotNull(message = "机构名不能为空")
    private String organization;

    /** 地址 */
    @ApiModelProperty(value = "地址")
    @NotNull(message = "地址不能为空")
    private String address;

    /** 联系人 */
    @ApiModelProperty(value = "联系人")
    @NotNull(message = "联系人不能为空")
    private String contact;

    /** 联系电话 */
    @ApiModelProperty(value = "联系电话")
    @NotNull(message = "联系电话不能为空")
    @Pattern(regexp = "^1[34578]\\d{9}$", message = "不是正确的电话号码")
    private String phone;

    /** ip白名单 */
    @ApiModelProperty(value = "ip白名单")
    private String whiteIP;

    @Override
    public String toString() {
        return "UserInfo{" +
                "organization='" + organization + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", whiteIP='" + whiteIP + '\'' +
                '}';
    }

    public String getWhiteIP() {
        return whiteIP;
    }

    public void setWhiteIP(String whiteIP) {
        this.whiteIP = whiteIP;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
