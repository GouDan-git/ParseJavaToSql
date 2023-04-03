package com.fawkes.sys.user.common.model;

import com.fawkes.core.base.model.BaseEntity;

import java.io.Serializable;

public class MiddleUserSchedule extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_user_schedule.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_user_schedule.schedule_id
     *
     * @mbggenerated
     */
    private Long scheduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_user_schedule.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table middle_user_schedule
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_user_schedule.user_name
     *
     * @return the value of middle_user_schedule.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_user_schedule.user_name
     *
     * @param userName the value for middle_user_schedule.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_user_schedule.schedule_id
     *
     * @return the value of middle_user_schedule.schedule_id
     *
     * @mbggenerated
     */
    public Long getScheduleId() {
        return scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_user_schedule.schedule_id
     *
     * @param scheduleId the value for middle_user_schedule.schedule_id
     *
     * @mbggenerated
     */
    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_user_schedule.tenant_id
     *
     * @return the value of middle_user_schedule.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_user_schedule.tenant_id
     *
     * @param tenantId the value for middle_user_schedule.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_user_schedule
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MiddleUserSchedule other = (MiddleUserSchedule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getScheduleId() == null ? other.getScheduleId() == null : this.getScheduleId().equals(other.getScheduleId()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_user_schedule
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getScheduleId() == null) ? 0 : getScheduleId().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_user_schedule
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}