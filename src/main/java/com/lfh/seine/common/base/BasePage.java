package com.lfh.seine.common.base;

import lombok.Data;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 18:25
 * @Description: 基础分页
 * @Version: 1.0
 */
@Data
public class BasePage {
    private Integer pageNum = 1;
    private Integer pageSize = 10;

    public Integer getPageNum() {
        return pageNum < 1 ? 1 : pageNum;
    }

    public Integer getPageSize() {
        return pageSize < 0 ? 0 : pageSize;
    }
}
