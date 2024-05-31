CREATE TABLE IF NOT EXISTS `sys_user` (
   `user_id` BIGINT ( 20 ) NOT NULL COMMENT 'id',
   `user_name` VARCHAR ( 50 ) DEFAULT NULL COMMENT '用户登录名',
   `nick_name` VARCHAR ( 50 ) DEFAULT NULL COMMENT '用户昵称',
   `avatar_url` VARCHAR ( 500 ) DEFAULT NULL COMMENT '用户头像',
   `password` VARCHAR ( 100 ) DEFAULT NULL COMMENT '密码',
   `email` VARCHAR ( 100 ) DEFAULT NULL COMMENT '邮箱',
   `mobile` VARCHAR ( 100 ) DEFAULT NULL COMMENT '手机号',
   `is_admin` TINYINT ( 3 ) DEFAULT '0' COMMENT '系统管理员：1： 是  0：不是',
   `user_status` TINYINT ( 3 ) DEFAULT '1' COMMENT '状态  0：禁用   1：正常',
   `create_user_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '创建者ID',
   `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
   `update_user_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '更新者ID',
   `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
   `is_deleted` TINYINT ( 3 ) DEFAULT '0' COMMENT '删除 0：未删除  1：已删除',
   PRIMARY KEY ( `user_id` ) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2889 DEFAULT CHARSET = utf8mb4 ROW_FORMAT = DYNAMIC COMMENT = '系统用户';