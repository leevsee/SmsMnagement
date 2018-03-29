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
@TableName("t_sms_account_sent")
public class TSmsAccountSent extends Model<TSmsAccountSent> {

    private static final long serialVersionUID = 1L;

    @TableId("Msg_ID")
    private Long msgId;
    @TableField("Account_ID")
    private Long accountId;


    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    protected Serializable pkVal() {
        return this.msgId;
    }

    @Override
    public String toString() {
        return "TSmsAccountSent{" +
        ", msgId=" + msgId +
        ", accountId=" + accountId +
        "}";
    }
}
