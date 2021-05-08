package com.gymzzak.pt.exception;

import com.gymzzak.pt.errors.ErrorCode;
import lombok.Getter;
import org.springframework.validation.Errors;

@Getter
public class ValidationException extends BusinessException {

    private final Errors errors;

    public ValidationException(Errors errors) {
        super(ErrorCode.VALIDATION_ERROR);
        this.errors = errors;
    }

}
