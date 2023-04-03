package com.fawkes.cde.document.common.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fawkes.cde.document.common.config.dateTime.LocalDateTimeAttributeConverter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Convert;

/**
 * <p>
 *
 * </p>
 *
 * @author Fyn
 * @since 2021-09-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserFile对象", description = "")
public class UserFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户文件id")
    @TableId(type = IdType.ASSIGN_ID, value = "userFileId")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userFileId;

    @ApiModelProperty(value = "扩展名")
    @TableField("extendName")
    private String extendName;

    @ApiModelProperty(value = "文件id")
    @TableField("fileId")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long fileId;

    @ApiModelProperty(value = "文件名")
    @TableField("fileName")
    private String fileName;

    @ApiModelProperty(value = "文件路径")
    @TableField("filePath")
    private String filePath;

    @ApiModelProperty(value = "是否是目录 0-否, 1-是")
    @TableField("isDir")
    private Integer isDir;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人用户名")
    @TableField("createBy")
    private String createBy;

    @ApiModelProperty(value = "创建人姓名")
    @TableField("createUserName")
    private String createUserName;

    @ApiModelProperty(value = "修改时间")
    @TableField("updateTime")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "修改人用户名")
    @TableField("updateBy")
    private String updateBy;

    @ApiModelProperty(value = "修改人姓名")
    @TableField("updateUserName")
    private String updateUserName;

    @ApiModelProperty(value = "删除批次号")
    @TableField("deleteBatchNum")
    private String deleteBatchNum;

    @ApiModelProperty(value = "删除标志 0-未删除 1-已删除")
    @TableField("deleteFlag")
    private Integer deleteFlag;

    @ApiModelProperty(value = "删除时间")
    @TableField("deleteTime")
    private String deleteTime;

    @ApiModelProperty(value = "父节点id")
    @TableField("parentId")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentId;

    @ApiModelProperty(value = "类型 0-普通文件 1-模型文件")
    @TableField("type")
    private Integer type;

    @ApiModelProperty(value = "模型文件是否解析完成 0-未完成 1-已完成")
    @TableField("isComplete")
    private Integer isComplete;

    @ApiModelProperty(value = "是否为当前展示版本")
    @TableField("currentVersion")
    private Integer currentVersion;

    @ApiModelProperty(value = "项目Id")
    @TableField("projectId")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long projectId;

    @ApiModelProperty(value = "版本号")
    @TableField("version")
    private Integer version;

    @TableField(exist = false)
    private String fileAuths;

    @ApiModelProperty(value = "是否为特殊文件夹")
    @TableField("specialFolder")
    private Integer specialFolder;
}
