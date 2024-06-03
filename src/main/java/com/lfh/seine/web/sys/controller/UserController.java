package com.lfh.seine.web.sys.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lfh.seine.common.base.BasePage;
import com.lfh.seine.common.result.CommonResult;
import com.lfh.seine.common.validation.ValidationSave;
import com.lfh.seine.common.validation.ValidationUpdate;
import com.lfh.seine.web.sys.entity.SysUser;
import com.lfh.seine.web.sys.mode.dto.SysUserDTO;
import com.lfh.seine.web.sys.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/listUser")
    public CommonResult<PageInfo<SysUser>> listUser(@RequestBody BasePage basePage) {
        PageHelper.startPage(basePage.getPageNum(), basePage.getPageSize());
        List<SysUser> list = sysUserService.list();
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        return CommonResult.success(pageInfo);
    }

    @PostMapping("/createAccount")
    public CommonResult<?> createAccount(@RequestBody @Validated(ValidationSave.class) SysUserDTO sysUserDTO) {
        sysUserService.createAccount(sysUserDTO);
        return CommonResult.success();
    }

    @PostMapping("/updateUser")
    public CommonResult<?> updateUser(@RequestBody @Validated(ValidationUpdate.class) SysUser sysUser) {
        return CommonResult.success(sysUserService.updateById(sysUser));
    }

    @GetMapping("/removeUser")
    public CommonResult<?> removeUser(@RequestParam Long userId) {
        return CommonResult.success(sysUserService.removeById(userId));
    }

    @GetMapping("/getSysUserByUserName")
    public CommonResult<?> getSysUserByUserName(@RequestParam String userName) {
        return CommonResult.success(sysUserService.getSysUserByUserName(userName));
    }

}
