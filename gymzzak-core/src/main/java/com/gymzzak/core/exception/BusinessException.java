package com.gymzzak.core.exception;

import com.gymzzak.core.errors.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends Exception {

    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
