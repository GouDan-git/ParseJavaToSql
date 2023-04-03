package com.fawkes.cde.document.common.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ResolveProject implements Serializable {
    private String projectId;
    private String projectName;
    private String versionName;
    private String engineCode;
    private Integer engineType;
    private String serverUrl;
}
