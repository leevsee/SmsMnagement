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
@TableName("t_sms_order_pending")
public class TSmsOrderPending extends Model<TSmsOrderPending> {

    private static final long serialVersionUID = 1L;

    @TableId("Order_ID")
    private Long orderId;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "TSmsOrderPending{" +
        ", orderId=" + orderId +
        "}";
    }
}
