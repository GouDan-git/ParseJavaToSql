package com.fawkes.cde.component.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Fyn
 * @since 2021-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProjectVersion对象", description="")
public class ProjectVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    private String createBy;

    private LocalDateTime createDate;

    private String updateBy;

    private LocalDateTime updateDate;

    private Integer deleteFlag;

    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long projectId;

    private String versionGuid;

    private String description;

    private Integer versionState;

    private String url;

    private Integer functionbarChoose;

    private String filelistMain;

    private String filelistRef;

    private Integer versionType;

    private String thumbnail;

    private Integer expectGenerateTime;

    private Integer realGenerateTime;

    private String generateInfo;


}
