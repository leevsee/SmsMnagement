package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import java.math.BigDecimal;
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
@TableName("t_sms_pack")
public class TSmsPack extends Model<TSmsPack> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Pack_ID", type = IdType.AUTO)
    private Integer packId;
    @TableField("Pack_Name")
    private String packName;
    private Long Total;
    private BigDecimal Amount;
    @TableField("Display_Order")
    private Integer displayOrder;
    private Integer Available;


    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    public Long getTotal() {
        return Total;
    }

    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getAvailable() {
        return Available;
    }

    public void setAvailable(Integer Available) {
        this.Available = Available;
    }

    @Override
    protected Serializable pkVal() {
        return this.packId;
    }

    @Override
    public String toString() {
        return "TSmsPack{" +
        ", packId=" + packId +
        ", packName=" + packName +
        ", Total=" + Total +
        ", Amount=" + Amount +
        ", displayOrder=" + displayOrder +
        ", Available=" + Available +
        "}";
    }
}
