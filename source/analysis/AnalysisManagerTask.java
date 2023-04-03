package com.fawkes.cde.analysis.common.model;

import com.fawkes.core.base.model.BaseEntity;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 调度任务对象 analysis_manager_task
 *
 * @author zhao_yj
 * @date 2022-02-10
 */
@ToString
public class AnalysisManagerTask extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 引擎Id */
    @ApiModelProperty(value = "引擎Id" ,required = false)
    private String engineId;
    /**  引擎名称 */
    @ApiModelProperty(value = "引擎名称", required = false)
    private String engineName;
    /** 引擎编码*/
    @ApiModelProperty(value = "引擎编码", required = false)
    private String engineCode;
    /** 引擎类型 */
    @ApiModelProperty(value = "引擎类型" ,required = false)
    private Integer engineType;
    /** 服务id  */
    @ApiModelProperty(value = "服务id " ,required = false)
    private String serverId;

    /** 用户id */
    @ApiModelProperty(value = "用户id" ,required = false)
    private String userId;

    /** 任务名称 */
    @ApiModelProperty(value = "任务名称" ,required = false)
    private String taskName;

    /** 文件存储服务中的文件唯一标识 */
    @ApiModelProperty(value = "文件存储服务中的文件唯一标识" ,required = false)
    private String fileToken;

    /** 任务描述 */
    @ApiModelProperty(value = "任务描述" ,required = false)
    private String taskDescribe;

    /** 任务状态 */
    @ApiModelProperty(value = "任务状态" ,required = false)
    private Long taskStatus;

    /** 解析返回JSON */
    @ApiModelProperty(value = "解析返回JSON" ,required = false)
    private String anasysisResult;

    /** 是否消费，1已消费  0未消费 */
    @ApiModelProperty(value = "是否消费" ,required = false)
    private Integer isConsume;
    /** 是否解析，1已解析  0未解析 */
    @ApiModelProperty(value = "是否解析" ,required = false)
    private Integer isResolve;
    /** 是否指定，1已指定  0未指定 */
    @ApiModelProperty(value = "是否指定" ,required = false)
    private Integer isAppoint;
    /** 是否远程执行器，1远程执行器  0本地执行器 */
    @ApiModelProperty(value = "是否远程执行器" ,required = false)
    private Integer isRemote;
    /** 远程执行器类型 */
    @ApiModelProperty(value = "远程执行器类型" ,required = false)
    private String actuatorType;
    /** 远程执行器名称 */
    @ApiModelProperty(value = "远程执行器名称" ,required = false)
    private String actuatorName;
    /** 远程执行器访问地址 */
    @ApiModelProperty(value = "远程执行器访问地址" ,required = false)
    private String actuatorUrl;

    private String serverName;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }

    public void setServerId(String serverId)
    {
        this.serverId = serverId;
    }

    public String getServerId()
    {
        return serverId;
    }
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }
    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    public String getTaskName()
    {
        return taskName;
    }
    public void setFileToken(String fileToken)
    {
        this.fileToken = fileToken;
    }

    public String getFileToken()
    {
        return fileToken;
    }
    public void setTaskDescribe(String taskDescribe)
    {
        this.taskDescribe = taskDescribe;
    }

    public String getTaskDescribe()
    {
        return taskDescribe;
    }
    public void setTaskStatus(Long taskStatus)
    {
        this.taskStatus = taskStatus;
    }

    public Long getTaskStatus()
    {
        return taskStatus;
    }
    public void setAnasysisResult(String anasysisResult)
    {
        this.anasysisResult = anasysisResult;
    }

    public String getAnasysisResult()
    {
        return anasysisResult;
    }

    public Integer getIsConsume() {
        return isConsume;
    }

    public void setIsConsume(Integer isConsume) {
        this.isConsume = isConsume;
    }

    public Integer getIsResolve() {
        return isResolve;
    }

    public void setIsResolve(Integer isResolve) {
        this.isResolve = isResolve;
    }

    public Integer getIsAppoint() {
        return isAppoint;
    }

    public void setIsAppoint(Integer isAppoint) {
        this.isAppoint = isAppoint;
    }

    public Integer getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(Integer isRemote) {
        this.isRemote = isRemote;
    }

    public String getActuatorType() {
        return actuatorType;
    }

    public void setActuatorType(String actuatorType) {
        this.actuatorType = actuatorType;
    }

    public String getActuatorName() {
        return actuatorName;
    }

    public void setActuatorName(String actuatorName) {
        this.actuatorName = actuatorName;
    }

    public String getActuatorUrl() {
        return actuatorUrl;
    }

    public void setActuatorUrl(String actuatorUrl) {
        this.actuatorUrl = actuatorUrl;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("serverId", getServerId())
                .append("userId", getUserId())
                .append("taskName", getTaskName())
                .append("fileToken", getFileToken())
                .append("taskDescribe", getTaskDescribe())
                .append("taskStatus", getTaskStatus())
                .append("anasysisResult", getAnasysisResult())
                .append("createBy", getCreateBy())
                .append("createDate", getCreateDate())
                .append("updateDate", getUpdateDate())
                .append("deleteFlag", getDeleteFlag())
                .append("serverName",getServerName())
                .toString();
    }
}
