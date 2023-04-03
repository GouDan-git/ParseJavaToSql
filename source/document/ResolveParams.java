package com.fawkes.cde.document.common.model;

import com.fawkes.cde.document.common.vo.ResolveFileVO;
import lombok.Data;
import lombok.ToString;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class ResolveParams implements Serializable {

    // 后缀
    private String fileSuffix;
    // 特殊文件夹
    private Long folderId; // 依据该参数获取所属CBE项目
    // 文件信息
    private List<String> masterFileTokens;
    private List<Long> fileVersionIds;
    // 批量文件信息
    private List<ResolveFileVO> files;
    // 引擎类型
    private String engineCode;
    // 解析器编码
    private String resolveCode;
    private String projectSign;
    // 回调地址
    private String restUrl;
}
