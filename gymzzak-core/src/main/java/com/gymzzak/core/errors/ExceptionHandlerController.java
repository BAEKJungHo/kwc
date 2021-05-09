package com.gymzzak.core.errors;

import com.gymzzak.core.exception.BusinessException;
import com.gymzzak.core.exception.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponse> validation(ValidationException e) {
        log.error("Validation Exception occur", e);
        return ResponseEntity
                .status(ErrorCode.VALIDATION_ERROR.getStatus())
                .body(ErrorResponse.of(ErrorCode.VALIDATION_ERROR));
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> business(BusinessException e) {
        log.error("Business Exception occur", e);
        return ResponseEntity
                .status(e.getErrorCode().getStatus())
                .body(ErrorResponse.of(e.getErrorCode()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exception(Exception e) {
        log.error("Not Defined or Not Handled Exception occur", e);
        return ResponseEntity
                .status(ErrorCode.INTERNAL_SERVER_ERROR.getStatus())
                .body(ErrorResponse.of(ErrorCode.INTERNAL_SERVER_ERROR));
    }

}
