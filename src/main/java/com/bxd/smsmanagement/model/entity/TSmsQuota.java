package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("t_sms_quota")
public class TSmsQuota extends Model<TSmsQuota> {

    private static final long serialVersionUID = 1L;

    @TableField("Total_Order")
    private Long totalOrder;
    @TableField("Total_Sent")
    private Long totalSent;
    @TableField("Quota_Remain")
    private Long quotaRemain;
    @TableId("Account_ID")
    private Long accountId;


    public Long getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Long totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Long getTotalSent() {
        return totalSent;
    }

    public void setTotalSent(Long totalSent) {
        this.totalSent = totalSent;
    }

    public Long getQuotaRemain() {
        return quotaRemain;
    }

    public void setQuotaRemain(Long quotaRemain) {
        this.quotaRemain = quotaRemain;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    protected Serializable pkVal() {
        return this.accountId;
    }

    @Override
    public String toString() {
        return "TSmsQuota{" +
        ", totalOrder=" + totalOrder +
        ", totalSent=" + totalSent +
        ", quotaRemain=" + quotaRemain +
        ", accountId=" + accountId +
        "}";
    }
}
