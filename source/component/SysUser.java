package com.fawkes.cde.component.common.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Fyn
 * @since 2021-11-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysUser对象", description="用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "数据状态 0可用 -1不可用")
    private Integer deleteFlag;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "员工号")
    private String userNo;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "姓名")
    private String userFullname;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "用户类型 1AD域 2其他")
    private Integer userType;

    @ApiModelProperty(value = "租户ID")
    private Integer tenantId;

    @ApiModelProperty(value = "账号状态 1激活状态 2休眠状态 3注销账号")
    private Integer accountStatus;

    @ApiModelProperty(value = "账号周期 1长期 2临时")
    private Integer accountPeriod;

    @ApiModelProperty(value = "最后活跃时间")
    private LocalDateTime lastActiveTime;

    @ApiModelProperty(value = "曾用名")
    private String formerName;

    @ApiModelProperty(value = "国籍")
    private String citizenship;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "出生年月")
    private LocalDate birthDay;

    @ApiModelProperty(value = "政治面貌（中共党员、共青团员、群众）")
    private String politics;

    @ApiModelProperty(value = "证件类型（1、身份证号）")
    private String idcardType;

    @ApiModelProperty(value = "证件号码")
    private String idcardNumber;

    @ApiModelProperty(value = "学历（小学、初中、中专/高中、专科、本科、硕士研究生、博士研究生）")
    private String education;

    @ApiModelProperty(value = "学位（学士,硕士,博士）")
    private String degree;

    @ApiModelProperty(value = "专业名称")
    private String majorName;

    @ApiModelProperty(value = "身高")
    private String stature;

    @ApiModelProperty(value = "体重")
    private String weight;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    @ApiModelProperty(value = "国籍")
    private String nationality;

    @ApiModelProperty(value = "工号")
    private String jobNumber;

    @ApiModelProperty(value = "婚姻状态（未婚、已婚、离婚、丧偶）")
    private String marriageState;

    @ApiModelProperty(value = "紧急联系人电话")
    private String emergencyPhone;

    @ApiModelProperty(value = "紧急联系人姓名")
    private String emergencyName;

    @ApiModelProperty(value = "办公地点")
    private String officeLocation;

    @ApiModelProperty(value = "电子签名附件token")
    private String signToken;

    @ApiModelProperty(value = "照片token")
    private String photoToken;

    @ApiModelProperty(value = "是否更新初始密码")
    private Boolean isInitPwd;

    @ApiModelProperty(value = "办公电话")
    private String officePhone;

    @ApiModelProperty(value = "其他电话")
    private String otherPhone;

    @ApiModelProperty(value = "职务")
    private String title;

    @ApiModelProperty(value = "工作年限")
    private String workingSeniority;

    @ApiModelProperty(value = "入职时间")
    private LocalDate hiredate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "最后更新密码时间")
    private LocalDateTime lastUpdatePwdTime;

    @ApiModelProperty(value = "头像token")
    private String avatarToken;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "个人简介")
    private String introduction;


}
