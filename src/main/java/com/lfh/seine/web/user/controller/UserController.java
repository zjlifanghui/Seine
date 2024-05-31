package com.lfh.seine.web.user.controller;

import com.lfh.seine.common.result.CommonResult;
import com.lfh.seine.web.user.entity.SysUser;
import com.lfh.seine.web.user.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 15:18
 * @Description: 用户信息控制器
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private SysUserService sysUserService;

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("/getUser")
    public CommonResult<SysUser> getUser(@RequestParam Long userId) {
        return CommonResult.success(sysUserService.getById(userId));
    }
}
