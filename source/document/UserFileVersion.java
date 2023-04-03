package com.fawkes.cde.document.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fawkes.cde.document.common.config.dateTime.LocalDateTimeAttributeConverter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Convert;

/**
 * <p>
 * 文件版本表
 * </p>
 *
 * @author Fyn
 * @since 2022-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "UserFileVersion对象", description = "文件版本表")
public class UserFileVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "版本Id")
    @TableId(type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "文件Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long fileId;

    @ApiModelProperty(value = "文件token")
    private String fileToken;

    @ApiModelProperty(value = "版本号")
    private Integer versionNum;

    @ApiModelProperty(value = "是否为当前指定版本 1-true 2-false")
    private Boolean isCurrentVersion;

    @ApiModelProperty(value = "文件大小")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long fileSize;

    @ApiModelProperty(value = "上传者")
    private String createBy;

    @ApiModelProperty(value = "上传时间")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "删除状态 1-true 2-false")
    private Boolean deleteFlag;

    @ApiModelProperty(value = "删除时间")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime deleteDate;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "解析状态")
    private Integer isResolve;

    @TableField(exist = false)
    private String url;

    @TableField(exist = false)
    private String versionGuid;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private Long versionId;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private Long projectId;

    @TableField(exist = false)
    private String projectGuid;

    @TableField(exist = false)
    private String serverAddress;

    @TableField(exist = false)
    private String serverResolveAddress;

}
