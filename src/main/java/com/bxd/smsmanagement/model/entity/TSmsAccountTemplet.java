package com.bxd.smsmanagement.model.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leeves
 * @since 2018-03-28
 */
@TableName("t_sms_account_templet")
public class TSmsAccountTemplet extends Model<TSmsAccountTemplet> {

    private static final long serialVersionUID = 1L;

    /**
     * 账户ID
     */
    @TableField("Account_ID")
    private Long accountId;
    /**
     * 模板id
     */
    @TableField("Templet_Id")
    private Long templetId;
    /**
     * 选择模板时间
     */
    @TableField("Created_Time")
    private Date createdTime;


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getTempletId() {
        return templetId;
    }

    public void setTempletId(Long templetId) {
        this.templetId = templetId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.accountId;
    }

    @Override
    public String toString() {
        return "TSmsAccountTemplet{" +
        ", accountId=" + accountId +
        ", templetId=" + templetId +
        ", createdTime=" + createdTime +
        "}";
    }
}
