package com.bxd.smsmanagement.model.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("t_sms_msg")
public class TSmsMsg extends Model<TSmsMsg> {

    private static final long serialVersionUID = 1L;

    @TableId("Msg_ID")
    private Long msgId;
    @TableField("Msg_Time")
    private Date msgTime;
    @TableField("Receiver_Count")
    private Long receiverCount;
    @TableField("Unreach_Count")
    private Long unreachCount;
    @TableField("End_Proc_Time")
    private Date endProcTime;
    @TableField("Start_Proc_Time")
    private Date startProcTime;
    @TableField("First_Reach_Count")
    private Long firstReachCount;
    @TableField("Sender_ID")
    private String senderId;
    @TableField("Account_ID")
    private Long accountId;
    @TableField("Msg_Text")
    private String msgText;


    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    public Long getReceiverCount() {
        return receiverCount;
    }

    public void setReceiverCount(Long receiverCount) {
        this.receiverCount = receiverCount;
    }

    public Long getUnreachCount() {
        return unreachCount;
    }

    public void setUnreachCount(Long unreachCount) {
        this.unreachCount = unreachCount;
    }

    public Date getEndProcTime() {
        return endProcTime;
    }

    public void setEndProcTime(Date endProcTime) {
        this.endProcTime = endProcTime;
    }

    public Date getStartProcTime() {
        return startProcTime;
    }

    public void setStartProcTime(Date startProcTime) {
        this.startProcTime = startProcTime;
    }

    public Long getFirstReachCount() {
        return firstReachCount;
    }

    public void setFirstReachCount(Long firstReachCount) {
        this.firstReachCount = firstReachCount;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    @Override
    protected Serializable pkVal() {
        return this.msgId;
    }

    @Override
    public String toString() {
        return "TSmsMsg{" +
        ", msgId=" + msgId +
        ", msgTime=" + msgTime +
        ", receiverCount=" + receiverCount +
        ", unreachCount=" + unreachCount +
        ", endProcTime=" + endProcTime +
        ", startProcTime=" + startProcTime +
        ", firstReachCount=" + firstReachCount +
        ", senderId=" + senderId +
        ", accountId=" + accountId +
        ", msgText=" + msgText +
        "}";
    }
}
