package com.fawkes.cde.component.common.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value = "ComponentFileCategory对象", description = "")
public class ComponentFileCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "元器件文件id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long componentFileId;

    @ApiModelProperty(value = "元器件分类id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long componentCategoryDataId;
}
