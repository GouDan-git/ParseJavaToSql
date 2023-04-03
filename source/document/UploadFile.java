package com.fawkes.cde.document.common.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Fyn
 * @version 1.0
 * @description:
 * @date 2021/9/26 20:41
 */
@Data
public class UploadFile {

    private String fileName;

    private String fileType;

    private Long fileSize;

    private String timeStampName;

    private Integer success;

    private String message;

    private String url;

    private String identifier;

    private Long totalSize;

    private Long parentId;

    private MultipartFile file;
}
