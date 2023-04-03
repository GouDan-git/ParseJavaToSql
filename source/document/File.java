package com.fawkes.cde.document.common.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

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
 * @since 2021-09-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "File对象", description = "")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文件id")
    @TableId(type = IdType.ASSIGN_ID, value = "fileId")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long fileId;

    @ApiModelProperty(value = "文件大小")
    @TableField("fileSize")
    private Long fileSize;

    @ApiModelProperty(value = "文件url")
    @TableField("fileUrl")
    private String fileUrl;

    @ApiModelProperty(value = "文件md5")
    private String identifier;

    @ApiModelProperty(value = "文件引用数量")
    @TableField("pointCount")
    private Integer pointCount;

    @ApiModelProperty(value = "时间戳名称")
    @TableField("timeStampName")
    private String timeStampName;

    @ApiModelProperty(value = "存储类型 0-本地存储, 1-阿里云存储, 2-FastDFS存储")
    @TableField("storageType")
    private Integer storageType;


}
