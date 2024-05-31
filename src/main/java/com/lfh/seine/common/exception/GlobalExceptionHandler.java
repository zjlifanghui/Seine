package com.lfh.seine.common.exception;

import com.lfh.seine.common.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: lfh
 * @CreateTime: 2024-05-31 15:40
 * @Description: 全局异常捕获
 * @Version: 1.0
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public CommonResult<?> handleException(Exception e) {
        log.error("未知异常(Exception)", e);
        return CommonResult.fail(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("参数错误异常(Exception)", e);
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return CommonResult.fail(objectError.getDefaultMessage());
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public CommonResult<?> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        log.error("数据库字段约束异常(Exception)", e);
        return CommonResult.fail(e.getCause().getMessage());
    }

}
