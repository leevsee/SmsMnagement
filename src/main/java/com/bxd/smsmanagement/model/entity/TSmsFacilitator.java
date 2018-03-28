package com.bxd.smsmanagement.model.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("t_sms_facilitator")
public class TSmsFacilitator extends Model<TSmsFacilitator> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "Facilitator_Id", type = IdType.AUTO)
    private Long facilitatorId;
    /**
     * 短信运营商名字
     */
    @TableField("Facilitator_Name")
    private String facilitatorName;
    /**
     * 短信提供商Key
     */
    @TableField("Facilitator_Access_Key")
    private String facilitatorAccessKey;
    /**
     * 短信提供商密钥
     */
    @TableField("Facilitator_Access_Secret")
    private String facilitatorAccessSecret;
    /**
     * 记录运营商发送
     */
    @TableField("Facilitator_send_record")
    private Long facilitatorSendRecord;
    /**
     * 运营商总共短信数量
     */
    @TableField("Facilitator_total_record")
    private Long facilitatorTotalRecord;
    /**
     * 模板创建账户ID
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


    public Long getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(Long facilitatorId) {
        this.facilitatorId = facilitatorId;
    }

    public String getFacilitatorName() {
        return facilitatorName;
    }

    public void setFacilitatorName(String facilitatorName) {
        this.facilitatorName = facilitatorName;
    }

    public String getFacilitatorAccessKey() {
        return facilitatorAccessKey;
    }

    public void setFacilitatorAccessKey(String facilitatorAccessKey) {
        this.facilitatorAccessKey = facilitatorAccessKey;
    }

    public String getFacilitatorAccessSecret() {
        return facilitatorAccessSecret;
    }

    public void setFacilitatorAccessSecret(String facilitatorAccessSecret) {
        this.facilitatorAccessSecret = facilitatorAccessSecret;
    }

    public Long getFacilitatorSendRecord() {
        return facilitatorSendRecord;
    }

    public void setFacilitatorSendRecord(Long facilitatorSendRecord) {
        this.facilitatorSendRecord = facilitatorSendRecord;
    }

    public Long getFacilitatorTotalRecord() {
        return facilitatorTotalRecord;
    }

    public void setFacilitatorTotalRecord(Long facilitatorTotalRecord) {
        this.facilitatorTotalRecord = facilitatorTotalRecord;
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

    @Override
    protected Serializable pkVal() {
        return this.facilitatorId;
    }

    @Override
    public String toString() {
        return "TSmsFacilitator{" +
        ", facilitatorId=" + facilitatorId +
        ", facilitatorName=" + facilitatorName +
        ", facilitatorAccessKey=" + facilitatorAccessKey +
        ", facilitatorAccessSecret=" + facilitatorAccessSecret +
        ", facilitatorSendRecord=" + facilitatorSendRecord +
        ", facilitatorTotalRecord=" + facilitatorTotalRecord +
        ", createdAccountId=" + createdAccountId +
        ", createdTime=" + createdTime +
        ", lastTime=" + lastTime +
        "}";
    }
}
