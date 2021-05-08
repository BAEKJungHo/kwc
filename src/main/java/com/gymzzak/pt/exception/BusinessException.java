package com.gymzzak.pt.exception;

import com.gymzzak.pt.errors.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends Exception {

    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
