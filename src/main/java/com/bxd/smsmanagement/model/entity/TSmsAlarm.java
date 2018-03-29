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
@TableName("t_sms_alarm")
public class TSmsAlarm extends Model<TSmsAlarm> {

    private static final long serialVersionUID = 1L;

    /**
     * 账户ID
     */
    @TableId("Account_ID")
    private Long accountId;
    /**
     * 预警类型
     */
    @TableField("Alarm_Type")
    private Integer alarmType;
    /**
     * 预警阶段数量
     */
    @TableField("Alarm_Stage_Num")
    private Integer alarmStageNum;
    /**
     * 预警条数
     */
    @TableField("Alarm_Stage")
    private String alarmStage;
    /**
     * 提醒时间
     */
    @TableField("Alarm_Time")
    private String alarmTime;
    /**
     * 预警阶段需要发送次数
     */
    @TableField("Alarm_Stage_Time")
    private String alarmStageTime;
    /**
     * 预警发送了次数
     */
    @TableField("Alarm_Sended_Time")
    private String alarmSendedTime;
    /**
     * 短信预警电话
     */
    @TableField("Alarm_Phone")
    private String alarmPhone;
    /**
     * 发送模板
     */
    @TableField("Templet_Id")
    private String templetId;
    /**
     * 预警是否启用
     */
    private Integer Status;
    /**
     * 预警创建时间
     */
    @TableField("Created_Time")
    private Date createdTime;
    /**
     * 最后修改时间
     */
    @TableField("Last_Time")
    private Date lastTime;


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getAlarmStageNum() {
        return alarmStageNum;
    }

    public void setAlarmStageNum(Integer alarmStageNum) {
        this.alarmStageNum = alarmStageNum;
    }

    public String getAlarmStage() {
        return alarmStage;
    }

    public void setAlarmStage(String alarmStage) {
        this.alarmStage = alarmStage;
    }

    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getAlarmStageTime() {
        return alarmStageTime;
    }

    public void setAlarmStageTime(String alarmStageTime) {
        this.alarmStageTime = alarmStageTime;
    }

    public String getAlarmSendedTime() {
        return alarmSendedTime;
    }

    public void setAlarmSendedTime(String alarmSendedTime) {
        this.alarmSendedTime = alarmSendedTime;
    }

    public String getAlarmPhone() {
        return alarmPhone;
    }

    public void setAlarmPhone(String alarmPhone) {
        this.alarmPhone = alarmPhone;
    }

    public String getTempletId() {
        return templetId;
    }

    public void setTempletId(String templetId) {
        this.templetId = templetId;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
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
        return this.accountId;
    }

    @Override
    public String toString() {
        return "TSmsAlarm{" +
        ", accountId=" + accountId +
        ", alarmType=" + alarmType +
        ", alarmStageNum=" + alarmStageNum +
        ", alarmStage=" + alarmStage +
        ", alarmTime=" + alarmTime +
        ", alarmStageTime=" + alarmStageTime +
        ", alarmSendedTime=" + alarmSendedTime +
        ", alarmPhone=" + alarmPhone +
        ", templetId=" + templetId +
        ", Status=" + Status +
        ", createdTime=" + createdTime +
        ", lastTime=" + lastTime +
        "}";
    }
}
