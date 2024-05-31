package com.lfh.seine.web.user.controller;

import com.lfh.seine.common.result.CommonResult;
import com.lfh.seine.web.user.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("/getUser")
    public CommonResult<UserEntity> getUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("lfh");
        return CommonResult.success(userEntity);
    }
}
