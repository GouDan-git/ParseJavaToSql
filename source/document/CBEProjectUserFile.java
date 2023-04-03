package com.fawkes.cde.document.common.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author Fyn
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "CbeProjectUserFile对象", description = "")
@TableName("cbe_project_user_file")
public class CbeProjectUserFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "CBE项目id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long projectId;

    @ApiModelProperty(value = "CBE guid")
    private String projectGuid;

    @ApiModelProperty(value = "CBE项目版本id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long versionId;

    @ApiModelProperty(value = "userFileId")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userFileId;

    @ApiModelProperty(value = "CBE项目名称")
    private String projectName;

    @ApiModelProperty(value = "CBE项目版本名称")
    private String versionName;
}
