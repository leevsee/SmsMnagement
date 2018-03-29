package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import java.util.Date;
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
@TableName("t_sms_account_facilitator")
public class TSmsAccountFacilitator extends Model<TSmsAccountFacilitator> {

    private static final long serialVersionUID = 1L;

    /**
     * 账户id
     */
    @TableField("Account_ID")
    private Long accountId;
    /**
     * 模板id
     */
    @TableField("Facilitator_Id")
    private Long facilitatorId;
    /**
     * 选择供应商时间
     */
    @TableField("Created_Time")
    private Date createdTime;


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(Long facilitatorId) {
        this.facilitatorId = facilitatorId;
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
        return "TSmsAccountFacilitator{" +
        ", accountId=" + accountId +
        ", facilitatorId=" + facilitatorId +
        ", createdTime=" + createdTime +
        "}";
    }
}
