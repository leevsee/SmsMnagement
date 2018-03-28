package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
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
@TableName("t_sms_order")
public class TSmsOrder extends Model<TSmsOrder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Order_ID", type = IdType.AUTO)
    private Long orderId;
    @TableField("Order_Time")
    private Date orderTime;
    private BigDecimal Amount;
    private Long Total;
    private String Notes;
    @TableField("Checked_Flag")
    private Integer checkedFlag;
    @TableField("Check_Time")
    private Date checkTime;
    @TableField("Checker_Name")
    private String checkerName;
    @TableField("Account_ID")
    private Long accountId;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public Long getTotal() {
        return Total;
    }

    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public Integer getCheckedFlag() {
        return checkedFlag;
    }

    public void setCheckedFlag(Integer checkedFlag) {
        this.checkedFlag = checkedFlag;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "TSmsOrder{" +
        ", orderId=" + orderId +
        ", orderTime=" + orderTime +
        ", Amount=" + Amount +
        ", Total=" + Total +
        ", Notes=" + Notes +
        ", checkedFlag=" + checkedFlag +
        ", checkTime=" + checkTime +
        ", checkerName=" + checkerName +
        ", accountId=" + accountId +
        "}";
    }
}
