package com.fawkes.sys.msg.common.model.fawkes;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SysMsgClientMsgType extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_client_msg_type.client_id
     *
     * @mbggenerated
     */
    private String clientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_client_msg_type.msg_type
     *
     * @mbggenerated
     */
    private Integer msgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_client_msg_type.msg_type_name
     *
     * @mbggenerated
     */
    private String msgTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_msg_client_msg_type
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_client_msg_type.client_id
     *
     * @return the value of sys_msg_client_msg_type.client_id
     *
     * @mbggenerated
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_client_msg_type.client_id
     *
     * @param clientId the value for sys_msg_client_msg_type.client_id
     *
     * @mbggenerated
     */
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_client_msg_type.msg_type
     *
     * @return the value of sys_msg_client_msg_type.msg_type
     *
     * @mbggenerated
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_client_msg_type.msg_type
     *
     * @param msgType the value for sys_msg_client_msg_type.msg_type
     *
     * @mbggenerated
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_client_msg_type.msg_type_name
     *
     * @return the value of sys_msg_client_msg_type.msg_type_name
     *
     * @mbggenerated
     */
    public String getMsgTypeName() {
        return msgTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_client_msg_type.msg_type_name
     *
     * @param msgTypeName the value for sys_msg_client_msg_type.msg_type_name
     *
     * @mbggenerated
     */
    public void setMsgTypeName(String msgTypeName) {
        this.msgTypeName = msgTypeName == null ? null : msgTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_msg_client_msg_type
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
        SysMsgClientMsgType other = (SysMsgClientMsgType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getMsgTypeName() == null ? other.getMsgTypeName() == null : this.getMsgTypeName().equals(other.getMsgTypeName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_msg_client_msg_type
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
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getMsgTypeName() == null) ? 0 : getMsgTypeName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_msg_client_msg_type
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientId=").append(clientId);
        sb.append(", msgType=").append(msgType);
        sb.append(", msgTypeName=").append(msgTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}