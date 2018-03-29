package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
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
@TableName("t_sms_templet")
public class TSmsTemplet extends Model<TSmsTemplet> {

    private static final long serialVersionUID = 1L;

    /**
     * 短信模板id
     */
    @TableId(value = "Templet_Id", type = IdType.AUTO)
    private Long templetId;
    /**
     * 短信模板名字
     */
    @TableField("Templet_Name")
    private String templetName;
    /**
     * 模板名称
     */
    @TableField("Templet_Code")
    private String templetCode;
    @TableField("Templet_Content")
    private String templetContent;
    /**
     * 短信提供商id
     */
    @TableField("Facilitator_Id")
    private Long facilitatorId;
    /**
     * 模板类型
     */
    @TableField("Facilitator_Type")
    private Integer facilitatorType;
    /**
     * 短信提供商签名
     */
    @TableField("Facilitator_Sign_Name")
    private String facilitatorSignName;
    /**
     * 短信提供商模板code
     */
    @TableField("Facilitator_Templet_Code")
    private String facilitatorTempletCode;
    /**
     * 短信提供商模板参数
     */
    @TableField("Facilitator_Templet_Param")
    private String facilitatorTempletParam;
    /**
     * 创建模板用户的ID
     */
    @TableField("Created_Account_ID")
    private Long createdAccountId;
    /**
     * 创建时间
     */
    @TableField("Created_Time")
    private Date createdTime;
    /**
     * 更新时间
     */
    @TableField("Last_Time")
    private Date lastTime;
    /**
     * 备注
     */
    private String Remarks;


    public Long getTempletId() {
        return templetId;
    }

    public void setTempletId(Long templetId) {
        this.templetId = templetId;
    }

    public String getTempletName() {
        return templetName;
    }

    public void setTempletName(String templetName) {
        this.templetName = templetName;
    }

    public String getTempletCode() {
        return templetCode;
    }

    public void setTempletCode(String templetCode) {
        this.templetCode = templetCode;
    }

    public String getTempletContent() {
        return templetContent;
    }

    public void setTempletContent(String templetContent) {
        this.templetContent = templetContent;
    }

    public Long getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(Long facilitatorId) {
        this.facilitatorId = facilitatorId;
    }

    public Integer getFacilitatorType() {
        return facilitatorType;
    }

    public void setFacilitatorType(Integer facilitatorType) {
        this.facilitatorType = facilitatorType;
    }

    public String getFacilitatorSignName() {
        return facilitatorSignName;
    }

    public void setFacilitatorSignName(String facilitatorSignName) {
        this.facilitatorSignName = facilitatorSignName;
    }

    public String getFacilitatorTempletCode() {
        return facilitatorTempletCode;
    }

    public void setFacilitatorTempletCode(String facilitatorTempletCode) {
        this.facilitatorTempletCode = facilitatorTempletCode;
    }

    public String getFacilitatorTempletParam() {
        return facilitatorTempletParam;
    }

    public void setFacilitatorTempletParam(String facilitatorTempletParam) {
        this.facilitatorTempletParam = facilitatorTempletParam;
    }

    public Long getCreatedAccountId() {
        return createdAccountId;
    }

    public void setCreatedAccountId(Long createdAccountId) {
        this.createdAccountId = createdAccountId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    @Override
    protected Serializable pkVal() {
        return this.templetId;
    }

    @Override
    public String toString() {
        return "TSmsTemplet{" +
        ", templetId=" + templetId +
        ", templetName=" + templetName +
        ", templetCode=" + templetCode +
        ", templetContent=" + templetContent +
        ", facilitatorId=" + facilitatorId +
        ", facilitatorType=" + facilitatorType +
        ", facilitatorSignName=" + facilitatorSignName +
        ", facilitatorTempletCode=" + facilitatorTempletCode +
        ", facilitatorTempletParam=" + facilitatorTempletParam +
        ", createdAccountId=" + createdAccountId +
        ", createdTime=" + createdTime +
        ", lastTime=" + lastTime +
        ", Remarks=" + Remarks +
        "}";
    }
}
