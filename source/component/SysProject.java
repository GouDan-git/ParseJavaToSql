package com.fawkes.cde.component.common.model;

import java.time.LocalDateTime;
import java.io.Serializable;
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
 * @since 2021-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysProject对象", description="")
public class SysProject implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String guid;

    private String createBy;

    private String createName;

    private LocalDateTime createDate;

    private String updateBy;

    private LocalDateTime updateDate;

    private Integer deleteFlag;

    private String name;

    private String description;

    private String manager;

    private String managerName;

    private String companyid;

    private Long industryId;

    private String industryName;

    private String address;

    private String area;

    private String contractCode;

    private Long stateId;

    private String stateName;

    private String thumbnail;

    private Integer versionCount;

    private Integer memberCount;

    private String filetype;

    private Integer frozen;

    private String portal;


}
