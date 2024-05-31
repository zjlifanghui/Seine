package com.lfh.seine.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.lfh.seine.common.constant.CommonConstant;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 17:31
 * @Description: 基础类入参配置
 * @Version: 1.0
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private final static Long userId = 1L;

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createUserId", Long.class, userId);
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "isDeleted", Integer.class, CommonConstant.NOT_DELETE_STATUS);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateUserId", Long.class, userId);
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());

    }
}
