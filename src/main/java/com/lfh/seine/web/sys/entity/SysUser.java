package com.lfh.seine.web.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lfh.seine.common.base.BaseEntity;
import com.lfh.seine.common.validation.ValidationUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 15:18
 * @Description: 用户实体类
 * @Version: 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_user")
public class SysUser extends BaseEntity {
    @TableId(type = IdType.ASSIGN_ID)
    @NotNull(message = "用户id不能为空！", groups = ValidationUpdate.class)
    private Long userId;

    private String userName;

    private String nickName;

    private String avatarUrl;

    private String password;

    private String email;

    private String mobile;

    private Long isAdmin;

    private Long userStatus;
}
