package com.fawkes.cde.document.common.model;

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
 * @since 2022-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "ShareFile对象", description = "")
public class ShareFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long groupId;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userFileId;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userFileVersionId;

}
