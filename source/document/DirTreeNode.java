package com.fawkes.cde.document.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Fyn
 * @version 1.0
 * @description:
 * @date 2021/10/15 9:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirTreeNode {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userFileId;

    private String label;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentId;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long depth;

    private String FileAuths;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DirTreeNode> children;


    public static DirTreeNode root() {
        return new DirTreeNode(null, null, null, 0L, null, null);
    }

    public static DirTreeNode create(UserFile userFile, Long depth, List<DirTreeNode> children) {
        return new DirTreeNode(userFile.getUserFileId(), userFile.getFileName(), userFile.getParentId(), depth, userFile.getFileAuths(), children);
    }
}
