package com.fawkes.sys.user.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SysOauthUser extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.uuid
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.user_fullname
     *
     * @mbggenerated
     */
    private String userFullname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.avatar
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.blog
     *
     * @mbggenerated
     */
    private String blog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.company
     *
     * @mbggenerated
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.location
     *
     * @mbggenerated
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.gender
     *
     * @mbggenerated
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_user.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_oauth_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.tenant_id
     *
     * @return the value of sys_oauth_user.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.tenant_id
     *
     * @param tenantId the value for sys_oauth_user.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.uuid
     *
     * @return the value of sys_oauth_user.uuid
     *
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.uuid
     *
     * @param uuid the value for sys_oauth_user.uuid
     *
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.user_id
     *
     * @return the value of sys_oauth_user.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.user_id
     *
     * @param userId the value for sys_oauth_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.user_name
     *
     * @return the value of sys_oauth_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.user_name
     *
     * @param userName the value for sys_oauth_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.user_fullname
     *
     * @return the value of sys_oauth_user.user_fullname
     *
     * @mbggenerated
     */
    public String getUserFullname() {
        return userFullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.user_fullname
     *
     * @param userFullname the value for sys_oauth_user.user_fullname
     *
     * @mbggenerated
     */
    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname == null ? null : userFullname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.avatar
     *
     * @return the value of sys_oauth_user.avatar
     *
     * @mbggenerated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.avatar
     *
     * @param avatar the value for sys_oauth_user.avatar
     *
     * @mbggenerated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.blog
     *
     * @return the value of sys_oauth_user.blog
     *
     * @mbggenerated
     */
    public String getBlog() {
        return blog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.blog
     *
     * @param blog the value for sys_oauth_user.blog
     *
     * @mbggenerated
     */
    public void setBlog(String blog) {
        this.blog = blog == null ? null : blog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.company
     *
     * @return the value of sys_oauth_user.company
     *
     * @mbggenerated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.company
     *
     * @param company the value for sys_oauth_user.company
     *
     * @mbggenerated
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.location
     *
     * @return the value of sys_oauth_user.location
     *
     * @mbggenerated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.location
     *
     * @param location the value for sys_oauth_user.location
     *
     * @mbggenerated
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.email
     *
     * @return the value of sys_oauth_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.email
     *
     * @param email the value for sys_oauth_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.remark
     *
     * @return the value of sys_oauth_user.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.remark
     *
     * @param remark the value for sys_oauth_user.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.gender
     *
     * @return the value of sys_oauth_user.gender
     *
     * @mbggenerated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.gender
     *
     * @param gender the value for sys_oauth_user.gender
     *
     * @mbggenerated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_user.source
     *
     * @return the value of sys_oauth_user.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_user.source
     *
     * @param source the value for sys_oauth_user.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oauth_user
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
        SysOauthUser other = (SysOauthUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserFullname() == null ? other.getUserFullname() == null : this.getUserFullname().equals(other.getUserFullname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getBlog() == null ? other.getBlog() == null : this.getBlog().equals(other.getBlog()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oauth_user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserFullname() == null) ? 0 : getUserFullname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getBlog() == null) ? 0 : getBlog().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oauth_user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tenantId=").append(tenantId);
        sb.append(", uuid=").append(uuid);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userFullname=").append(userFullname);
        sb.append(", avatar=").append(avatar);
        sb.append(", blog=").append(blog);
        sb.append(", company=").append(company);
        sb.append(", location=").append(location);
        sb.append(", email=").append(email);
        sb.append(", remark=").append(remark);
        sb.append(", gender=").append(gender);
        sb.append(", source=").append(source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}