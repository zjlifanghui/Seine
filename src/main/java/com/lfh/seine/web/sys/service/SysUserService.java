package com.lfh.seine.web.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lfh.seine.web.sys.entity.SysUser;
import com.lfh.seine.web.sys.mode.dto.SysUserDTO;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 16:33
 * @Description: 用户服务接口
 * @Version: 1.0
 */
public interface SysUserService extends IService<SysUser> {

    SysUser getSysUserByUserName(String userName);

    void createAccount(SysUserDTO sysUserDTO);
}
