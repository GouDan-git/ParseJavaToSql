package com.fawkes.cde.component.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author Fyn
 * @since 2021-10-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "ComponentFile对象", description = "")
public class ComponentFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "扩展名")
    private String extendName;

    @ApiModelProperty(value = "文件名")
    private String fileName;

    @ApiModelProperty(value = "是否是目录 0-是，1-否")
    private Integer isDir;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人用户名")
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @ApiModelProperty(value = "删除标志 0-未删除 1-已删除")
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleteFlag;

    @ApiModelProperty(value = "父节点")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentId;

    @ApiModelProperty(value = "模型文件是否解析完成 0-未完成 1-已完成")
    @TableField(fill = FieldFill.INSERT)
    private Boolean isComplete;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人用户名")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    @ApiModelProperty(value = "是否为私有")
    private Boolean isPersonal;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty("图片Url")
    private String imageUrl;

    @TableField(fill = FieldFill.INSERT)
    private String createUserName;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateUserName;

    private Boolean CbeSupport;

    private String filePath;

    @ApiModelProperty(value = "解析状态")
    private Integer isResolve;

    @ApiModelProperty(value = "项目id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long projectId;

    @ApiModelProperty(value = "版本id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long versionId;

    @TableField(exist = false)
    private String versionGuid;

    @TableField(exist = false)
    private String url;
}
