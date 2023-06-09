package com.fawkes.sys.system.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class MiddleRoleDataScope extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_role_data_scope.role_id
     *
     * @mbggenerated
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_role_data_scope.data_scope_id
     *
     * @mbggenerated
     */
    private Long dataScopeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column middle_role_data_scope.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table middle_role_data_scope
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_role_data_scope.role_id
     *
     * @return the value of middle_role_data_scope.role_id
     *
     * @mbggenerated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_role_data_scope.role_id
     *
     * @param roleId the value for middle_role_data_scope.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_role_data_scope.data_scope_id
     *
     * @return the value of middle_role_data_scope.data_scope_id
     *
     * @mbggenerated
     */
    public Long getDataScopeId() {
        return dataScopeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_role_data_scope.data_scope_id
     *
     * @param dataScopeId the value for middle_role_data_scope.data_scope_id
     *
     * @mbggenerated
     */
    public void setDataScopeId(Long dataScopeId) {
        this.dataScopeId = dataScopeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column middle_role_data_scope.tenant_id
     *
     * @return the value of middle_role_data_scope.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column middle_role_data_scope.tenant_id
     *
     * @param tenantId the value for middle_role_data_scope.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_role_data_scope
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
        MiddleRoleDataScope other = (MiddleRoleDataScope) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getDataScopeId() == null ? other.getDataScopeId() == null : this.getDataScopeId().equals(other.getDataScopeId()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_role_data_scope
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getDataScopeId() == null) ? 0 : getDataScopeId().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table middle_role_data_scope
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", dataScopeId=").append(dataScopeId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}