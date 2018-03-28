package com.bxd.smsmanagement.model.entity;

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
 * @since 2018-03-28
 */
@TableName("t_sms_msg_pending")
public class TSmsMsgPending extends Model<TSmsMsgPending> {

    private static final long serialVersionUID = 1L;

    @TableId("Msg_ID")
    private Long msgId;


    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    @Override
    protected Serializable pkVal() {
        return this.msgId;
    }

    @Override
    public String toString() {
        return "TSmsMsgPending{" +
        ", msgId=" + msgId +
        "}";
    }
}
