package com.lfh.seine.web.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfh.seine.web.user.entity.SysUser;
import com.lfh.seine.web.user.mapper.SysUserMapper;
import com.lfh.seine.web.user.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 16:34
 * @Description: 用户服务实现类
 * @Version: 1.0
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
