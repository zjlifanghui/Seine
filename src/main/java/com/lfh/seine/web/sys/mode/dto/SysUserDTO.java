package com.lfh.seine.web.sys.mode.dto;

import com.lfh.seine.common.validation.ValidationSave;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * @Author: lfh
 * @CreateTime: 2024-06-03 9:28
 * @Description: 新增用户信息
 * @Version: 1.0
 */
@Data
public class SysUserDTO {
    @NotBlank(message = "用户账号不能为空！", groups = ValidationSave.class)
    private String userName;

    @NotBlank(message = "密码不能为空！", groups = ValidationSave.class)
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,20}$",
            message = "密码必须是6-20位，至少包含一个小写字母、一个大写字母和一个数字",
            groups = ValidationSave.class
    )
    private String password;

    @NotBlank(message = "手机号码不能为空！", groups = ValidationSave.class)
    @Pattern(
            regexp = "^1[3-9]\\d{9}$",
            message = "手机号格式不正确",
            groups = ValidationSave.class
    )
    private String mobile;
}
