package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leeves
 * @since 2018-03-29
 */
@TableName("t_sms_account")
public class TSmsAccount extends Model<TSmsAccount> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Account_ID", type = IdType.AUTO)
    private Long accountId;
    @TableField("Account_Code")
    private String accountCode;
    private String Passwd;
    @TableField("Account_Name")
    private String accountName;
    private String Address;
    @TableField("Contact_Name")
    private String contactName;
    @TableField("Contact_Phone")
    private String contactPhone;
    /**
     * 白名单
     */
    @TableField("White_Ip")
    private String whiteIp;


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getWhiteIp() {
        return whiteIp;
    }

    public void setWhiteIp(String whiteIp) {
        this.whiteIp = whiteIp;
    }

    @Override
    protected Serializable pkVal() {
        return this.accountId;
    }

    @Override
    public String toString() {
        return "TSmsAccount{" +
        ", accountId=" + accountId +
        ", accountCode=" + accountCode +
        ", Passwd=" + Passwd +
        ", accountName=" + accountName +
        ", Address=" + Address +
        ", contactName=" + contactName +
        ", contactPhone=" + contactPhone +
        ", whiteIp=" + whiteIp +
        "}";
    }
}
