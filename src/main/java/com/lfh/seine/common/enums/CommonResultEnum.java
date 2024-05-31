package com.lfh.seine.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 15:29
 * @Description: 公共返回类的枚举
 * @Version: 1.0
 */
@AllArgsConstructor
@Getter
public enum CommonResultEnum {
    SUCCESS(200, "success"),
    FAIL(500, "fail")
    ;

    private final Integer code;
    private final String msg;
}
