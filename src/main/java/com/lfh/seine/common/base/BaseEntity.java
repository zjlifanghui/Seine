package com.lfh.seine.common.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 17:22
 * @Description: 基础类字段
 * @Version: 1.0
 */
@Data
public class BaseEntity {
    @JsonIgnore
    @TableField(fill = FieldFill.INSERT)
    private Long createUserId;

    @JsonIgnore
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @JsonIgnore
    @TableField(fill = FieldFill.UPDATE)
    private Long updateUserId;

    @JsonIgnore
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @JsonIgnore
    private Integer isDeleted;
}
