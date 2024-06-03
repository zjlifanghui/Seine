package com.lfh.seine.web.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lfh.seine.web.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 16:31
 * @Description: 用户mapper
 * @Version: 1.0
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser getSysUserByUserName(@Param("userName") String userName);
}
