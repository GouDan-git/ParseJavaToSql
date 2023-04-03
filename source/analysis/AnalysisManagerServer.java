package com.fawkes.cde.analysis.common.model;

import com.fawkes.core.base.model.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 调度服务对象 analysis_manager_server
 * 
 * @author zhao_yj
 * @date 2022-02-10
 */
public class AnalysisManagerServer extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 引擎id */
    @ApiModelProperty(value = "引擎id" ,required = false)
    private String eId;

    /** 服务名称 */
    @ApiModelProperty(value = "服务名称" ,required = false)
    private String serverName;

    /** 服务点数 */
    @ApiModelProperty(value = "服务点数" ,required = false)
    private String serverPoint;

    /** 服务用户点数 */
    @ApiModelProperty(value = "服务用户点数" ,required = false)
    private String serverUserPoint;

    /** 服务地址 */
    @ApiModelProperty(value = "服务地址" ,required = false)
    private String serverAddress;

    /** 服务地址 */
    @ApiModelProperty(value = "服务地址" ,required = false)
    private String serverResolveAddress;

    /** 服务描述 */
    @ApiModelProperty(value = "服务描述" ,required = false)
    private String serverDescribe;

    /** 引擎编码 */
    private String engineCode;
    /** 引擎类型 */
    private Integer engineType;
    /** 驱动类 */
    private String beanName;
    /** 驱动方法 */
    private String methodName;

    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setEId(String eId)
    {
        this.eId = eId;
    }

    public String getEId() 
    {
        return eId;
    }
    public void setServerName(String serverName) 
    {
        this.serverName = serverName;
    }

    public String getServerName() 
    {
        return serverName;
    }
    public void setServerPoint(String serverPoint) 
    {
        this.serverPoint = serverPoint;
    }

    public String getServerPoint() 
    {
        return serverPoint;
    }
    public void setServerUserPoint(String serverUserPoint) 
    {
        this.serverUserPoint = serverUserPoint;
    }

    public String getServerUserPoint() 
    {
        return serverUserPoint;
    }

    public void setServerAddress(String serverAddress) 
    {
        this.serverAddress = serverAddress;
    }

    public String getServerAddress() 
    {
        return serverAddress;
    }
    public void setServerDescribe(String serverDescribe) 
    {
        this.serverDescribe = serverDescribe;
    }

    public String getServerDescribe() 
    {
        return serverDescribe;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getServerResolveAddress() {
        return serverResolveAddress;
    }

    public void setServerResolveAddress(String serverResolveAddress) {
        this.serverResolveAddress = serverResolveAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eId", getEId())
            .append("serverName", getServerName())
            .append("serverPoint", getServerPoint())
            .append("serverUserPoint", getServerUserPoint())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("serverAddress", getServerAddress())
            .append("serverDescribe", getServerDescribe())
            .append("deleteFlag", getDeleteFlag())
            .append("ids",getIds())
            .toString();
    }

}
