package com.lfh.seine.common.result;

import com.lfh.seine.common.enums.CommonResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 15:23
 * @Description: 公告返回类
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    /**
     * 成功
     *
     * @param data 数据
     * @param <T>  数据类型
     * @return 成功信息
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(CommonResultEnum.SUCCESS.getCode(), CommonResultEnum.SUCCESS.getMsg(), data);
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult<>(CommonResultEnum.SUCCESS.getCode(), CommonResultEnum.SUCCESS.getMsg(), null);
    }

    /**
     * 失败
     *
     * @param data 失败
     * @param <T>  数据类型
     * @return 失败
     */
    public static <T> CommonResult<T> fail(T data) {
        return new CommonResult<>(CommonResultEnum.FAIL.getCode(), CommonResultEnum.FAIL.getMsg(), data);
    }
}
