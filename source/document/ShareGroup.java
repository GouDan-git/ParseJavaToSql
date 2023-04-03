package com.fawkes.cde.document.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2022-01-12
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "ShareGroup对象", description = "")
public class ShareGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    private String name;

    private Boolean deleteFlag;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createTime;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime updateTime;

    private String createBy;

    private String updateBy;

    private String createFullname;

    private String updateFullname;

    private Integer shareType;

    private Boolean versionFollow;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime endTime;


}
