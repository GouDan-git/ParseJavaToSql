package com.fawkes.cde.document.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.dynamic.datasource.annotation.DS;
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
 * @since 2021-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysProject对象", description="")
@DS("slave_1")
public class SysProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    private String guid;

    private String createBy;

    private String createName;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createDate;

    private String updateBy;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime updateDate;

    private Integer deleteFlag;

    private String name;

    private String description;

    private String manager;

    private String managerName;

    private String companyid;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long industryId;

    private String industryName;

    private String address;

    private String area;

    private String contractCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long stateId;

    private String stateName;

    private String thumbnail;

    private Integer versionCount;

    private Integer memberCount;

    private String filetype;

    private Integer frozen;

    private String portal;


}
