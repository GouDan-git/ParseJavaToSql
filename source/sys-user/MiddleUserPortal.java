package com.fawkes.sys.user.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class MiddleUserPortal extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_user_portal.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_user_portal.portal_id
     *
     * @mbggenerated
     */
    private Long portalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_user_portal.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table middle_user_portal
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_user_portal.user_id
     *
     * @return the value of middle_user_portal.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_user_portal.user_id
     *
     * @param userId the value for middle_user_portal.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_user_portal.portal_id
     *
     * @return the value of middle_user_portal.portal_id
     *
     * @mbggenerated
     */
    public Long getPortalId() {
        return portalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_user_portal.portal_id
     *
     * @param portalId the value for middle_user_portal.portal_id
     *
     * @mbggenerated
     */
    public void setPortalId(Long portalId) {
        this.portalId = portalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_user_portal.tenant_id
     *
     * @return the value of middle_user_portal.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_user_portal.tenant_id
     *
     * @param tenantId the value for middle_user_portal.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_user_portal
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
        MiddleUserPortal other = (MiddleUserPortal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPortalId() == null ? other.getPortalId() == null : this.getPortalId().equals(other.getPortalId()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_user_portal
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_user_portal
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", portalId=").append(portalId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}