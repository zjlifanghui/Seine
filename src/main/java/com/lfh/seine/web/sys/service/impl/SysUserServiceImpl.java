package com.lfh.seine.web.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfh.seine.web.sys.entity.SysUser;
import com.lfh.seine.web.sys.mapper.SysUserMapper;
import com.lfh.seine.web.sys.mode.dto.SysUserDTO;
import com.lfh.seine.web.sys.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 16:34
 * @Description: 用户服务实现类
 * @Version: 1.0
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser getSysUserByUserName(String userName) {
        return baseMapper.getSysUserByUserName(userName);
    }

    @Override
    public void createAccount(SysUserDTO sysUserDTO) {
        SysUser sysUserByUserName = this.getSysUserByUserName(sysUserDTO.getUserName());
        if (Objects.nonNull(sysUserByUserName)) {
            throw new RuntimeException("账号已存在！");
        }
        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(sysUserDTO, sysUser);
        this.save(sysUser);
    }
}
