package com.lfh.seine.web.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 15:18
 * @Description: 用户实体类
 * @Version: 1.0
 */
@Data
@TableName("sys_user")
public class SysUser {
    @TableId(type = IdType.ASSIGN_ID)
    private Long userId;
    private String userName;
    private String nickName;
    private String avatarUrl;
    private String password;
    private String email;
    private String mobile;
    private Long isAdmin;
    private Long userStatus;
    private Long createUserId;
    private LocalDateTime createTime;
    private Long updateUserId;
    private LocalDateTime updateTime;
    private Long isDeleted;
}
