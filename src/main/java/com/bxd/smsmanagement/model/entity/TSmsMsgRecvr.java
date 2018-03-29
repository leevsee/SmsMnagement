package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("t_sms_msg_recvr")
public class TSmsMsgRecvr extends Model<TSmsMsgRecvr> {

    private static final long serialVersionUID = 1L;

    @TableField("Sent_Flag")
    private Integer sentFlag;
    @TableField("Sent_Time")
    private Date sentTime;
    @TableId("Recv_No")
    private Integer recvNo;
    @TableField("Msg_ID")
    private Long msgId;
    @TableField("Recv_ID")
    private String recvId;


    public Integer getSentFlag() {
        return sentFlag;
    }

    public void setSentFlag(Integer sentFlag) {
        this.sentFlag = sentFlag;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public Integer getRecvNo() {
        return recvNo;
    }

    public void setRecvNo(Integer recvNo) {
        this.recvNo = recvNo;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getRecvId() {
        return recvId;
    }

    public void setRecvId(String recvId) {
        this.recvId = recvId;
    }

    @Override
    protected Serializable pkVal() {
        return this.recvNo;
    }

    @Override
    public String toString() {
        return "TSmsMsgRecvr{" +
        ", sentFlag=" + sentFlag +
        ", sentTime=" + sentTime +
        ", recvNo=" + recvNo +
        ", msgId=" + msgId +
        ", recvId=" + recvId +
        "}";
    }
}
