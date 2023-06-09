package com.fawkes.sys.storage.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SysOssBurst extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_burst.upload_id
     *
     * @mbggenerated
     */
    private String uploadId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_burst.object_name
     *
     * @mbggenerated
     */
    private String objectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_burst.endpoint_key
     *
     * @mbggenerated
     */
    private String endpointKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_burst.bucket_name
     *
     * @mbggenerated
     */
    private String bucketName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_burst.upload_status
     *
     * @mbggenerated
     */
    private Integer uploadStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_burst.md5
     *
     * @mbggenerated
     */
    private String md5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_oss_burst
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oss_burst.upload_id
     *
     * @return the value of sys_oss_burst.upload_id
     *
     * @mbggenerated
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oss_burst.upload_id
     *
     * @param uploadId the value for sys_oss_burst.upload_id
     *
     * @mbggenerated
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId == null ? null : uploadId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oss_burst.object_name
     *
     * @return the value of sys_oss_burst.object_name
     *
     * @mbggenerated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oss_burst.object_name
     *
     * @param objectName the value for sys_oss_burst.object_name
     *
     * @mbggenerated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oss_burst.endpoint_key
     *
     * @return the value of sys_oss_burst.endpoint_key
     *
     * @mbggenerated
     */
    public String getEndpointKey() {
        return endpointKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oss_burst.endpoint_key
     *
     * @param endpointKey the value for sys_oss_burst.endpoint_key
     *
     * @mbggenerated
     */
    public void setEndpointKey(String endpointKey) {
        this.endpointKey = endpointKey == null ? null : endpointKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oss_burst.bucket_name
     *
     * @return the value of sys_oss_burst.bucket_name
     *
     * @mbggenerated
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oss_burst.bucket_name
     *
     * @param bucketName the value for sys_oss_burst.bucket_name
     *
     * @mbggenerated
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName == null ? null : bucketName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oss_burst.upload_status
     *
     * @return the value of sys_oss_burst.upload_status
     *
     * @mbggenerated
     */
    public Integer getUploadStatus() {
        return uploadStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oss_burst.upload_status
     *
     * @param uploadStatus the value for sys_oss_burst.upload_status
     *
     * @mbggenerated
     */
    public void setUploadStatus(Integer uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oss_burst.md5
     *
     * @return the value of sys_oss_burst.md5
     *
     * @mbggenerated
     */
    public String getMd5() {
        return md5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oss_burst.md5
     *
     * @param md5 the value for sys_oss_burst.md5
     *
     * @mbggenerated
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oss_burst
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
        SysOssBurst other = (SysOssBurst) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getUploadId() == null ? other.getUploadId() == null : this.getUploadId().equals(other.getUploadId()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getEndpointKey() == null ? other.getEndpointKey() == null : this.getEndpointKey().equals(other.getEndpointKey()))
            && (this.getBucketName() == null ? other.getBucketName() == null : this.getBucketName().equals(other.getBucketName()))
            && (this.getUploadStatus() == null ? other.getUploadStatus() == null : this.getUploadStatus().equals(other.getUploadStatus()))
            && (this.getMd5() == null ? other.getMd5() == null : this.getMd5().equals(other.getMd5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oss_burst
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
        result = prime * result + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getEndpointKey() == null) ? 0 : getEndpointKey().hashCode());
        result = prime * result + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        result = prime * result + ((getUploadStatus() == null) ? 0 : getUploadStatus().hashCode());
        result = prime * result + ((getMd5() == null) ? 0 : getMd5().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oss_burst
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uploadId=").append(uploadId);
        sb.append(", objectName=").append(objectName);
        sb.append(", endpointKey=").append(endpointKey);
        sb.append(", bucketName=").append(bucketName);
        sb.append(", uploadStatus=").append(uploadStatus);
        sb.append(", md5=").append(md5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}