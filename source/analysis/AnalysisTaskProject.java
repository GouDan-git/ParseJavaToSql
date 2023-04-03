package com.fawkes.cde.analysis.common.model;

import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 调度服务对象 analysis_manager_server
 * 
 * @author zhao_yj
 * @date 2022-02-10
 */
@Data
@ToString
public class AnalysisTaskProject implements Serializable{

    private static final long serialVersionUID = 1L;

    /** CBE项目版本 */
    private String versionId;
    private String versionGuid;
    private String versionUrl;
    /** CBE项目编码 */
    private String projectId;
    /** CBE项目任务 */
    private String taskId;

    private String projectGuid;
    private String serverId;
    private String serverAddress;
    private String serverResolveAddress;

}
