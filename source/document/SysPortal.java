package com.fawkes.cde.document.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.fawkes.cde.document.common.config.dateTime.LocalDateTimeAttributeConverter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Convert;

/**
 * <p>
 * 门户表
 * </p>
 *
 * @author Fyn
 * @since 2021-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysPortal对象", description="门户表")
public class SysPortal implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "数据状态 0可用 -1不可用")
    private Integer deleteFlag;

    @ApiModelProperty(value = "门户名称")
    private String name;

    @ApiModelProperty(value = "门户类型")
    private Integer type;

    @ApiModelProperty(value = "父门户ID")
    private String parentId;

    @ApiModelProperty(value = "关联ID")
    private String relationId;

    @ApiModelProperty(value = "门户绝对路径ID")
    private String pathId;

    @ApiModelProperty(value = "门户相对路径名称")
    private String pathName;

    @ApiModelProperty(value = "父门户名称")
    private String parentName;

    @ApiModelProperty(value = "顺序")
    private Integer sort;

    @ApiModelProperty(value = "租户ID")
    private Integer tenantId;


}
