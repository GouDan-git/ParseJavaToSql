package com.fawkes.cde.analysis.common.model;

import com.fawkes.core.base.model.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 调度引擎对象 analysis_manager_engine
 *
 * @author zhao_yj
 * @date 2022-02-11
 */
public class AnalysisManagerEngine extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 引擎名称
     */
    @ApiModelProperty(value = "引擎名称", required = false)
    private String engineName;

    /**
     * 引擎编码
     */
    @ApiModelProperty(value = "引擎编码", required = false)
    private String engineCode;

    /**
     * 引擎类型
     */
    @ApiModelProperty(value = "引擎类型", required = false)
    private Integer engineType;

    /**
     * 引擎描述
     */
    @ApiModelProperty(value = "引擎描述", required = false)
    private String engineDescribe;

    /**
     * 反射动态调用
     */
    @ApiModelProperty(value = "反射动态调用", required = false)
    private String beanName;

    /**
     * 反射动态调用
     */
    @ApiModelProperty(value = "反射动态调用", required = false)
    private String methodName;

    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setEngineType(Integer  engineType) {
        this.engineType = engineType;
    }

    public Integer  getEngineType() {
        return engineType;
    }

    public void setEngineDescribe(String engineDescribe) {
        this.engineDescribe = engineDescribe;
    }

    public String getEngineDescribe() {
        return engineDescribe;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
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
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("engineType", getEngineType())
                .append("engineDescribe", getEngineDescribe())
                .append("beanName", getBeanName())
                .append("methodName", getMethodName())
                .append("createBy", getCreateBy())
                .append("createDate", getCreateDate())
                .append("updateDate", getUpdateDate())
                .append("deleteFlag", getDeleteFlag())
                .append("ids",getIds())
                .toString();
    }
}

