package com.fawkes.cde.component.common.model;

import java.io.Serializable;

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
 * @since 2021-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CbeProjectComponentFile对象", description="")
@TableName("cbe_project_component_file")
public class CbeProjectComponentFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
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

    @ApiModelProperty(value = "用户文件列表id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long componentFileId;

    @ApiModelProperty(value = "CBE 项目名称")
    private String projectName;

    @ApiModelProperty(value = "CBE项目版本名称")
    private String versionName;


}
