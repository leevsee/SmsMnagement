package com.bxd.smsmanagement.model.entity;

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
 * @since 2018-03-29
 */
@TableName("t_sms_facilitotor_type")
public class TSmsFacilitotorType extends Model<TSmsFacilitotorType> {

    private static final long serialVersionUID = 1L;

    /**
     * 短信服务商id
     */
    @TableField("Facilitotor_Type_Id")
    private Integer facilitotorTypeId;
    /**
     * 短信服务商代码
     */
    @TableField("Facilitotor_Type_Code")
    private String facilitotorTypeCode;
    /**
     * 短信服务商名称
     */
    @TableField("Facilitotor_Type_Name")
    private String facilitotorTypeName;
    @TableField("Display_Order")
    private Integer displayOrder;


    public Integer getFacilitotorTypeId() {
        return facilitotorTypeId;
    }

    public void setFacilitotorTypeId(Integer facilitotorTypeId) {
        this.facilitotorTypeId = facilitotorTypeId;
    }

    public String getFacilitotorTypeCode() {
        return facilitotorTypeCode;
    }

    public void setFacilitotorTypeCode(String facilitotorTypeCode) {
        this.facilitotorTypeCode = facilitotorTypeCode;
    }

    public String getFacilitotorTypeName() {
        return facilitotorTypeName;
    }

    public void setFacilitotorTypeName(String facilitotorTypeName) {
        this.facilitotorTypeName = facilitotorTypeName;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Override
    protected Serializable pkVal() {
        return this.facilitotorTypeId;
    }

    @Override
    public String toString() {
        return "TSmsFacilitotorType{" +
        ", facilitotorTypeId=" + facilitotorTypeId +
        ", facilitotorTypeCode=" + facilitotorTypeCode +
        ", facilitotorTypeName=" + facilitotorTypeName +
        ", displayOrder=" + displayOrder +
        "}";
    }
}
