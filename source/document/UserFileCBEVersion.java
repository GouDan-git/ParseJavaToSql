package com.fawkes.cde.document.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fawkes.cde.document.common.config.dateTime.LocalDateTimeAttributeConverter;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Convert;
import java.time.LocalDateTime;

@Data
public class UserFileCbeVersion {
    @ApiModelProperty(value = "文件版本id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long fileVersionId;

    @ApiModelProperty(value = "版本id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long versionId;

    @ApiModelProperty(value = "任务id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long taskId;

    @ApiModelProperty(value = "创建时间")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createDate;
}
