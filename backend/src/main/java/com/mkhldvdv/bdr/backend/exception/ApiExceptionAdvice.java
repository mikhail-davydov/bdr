package com.mkhldvdv.bdr.backend.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.mkhldvdv.bdr.backend.common.Constants.LOG_HANDLE_EXCEPTION_TEMPLATE;

@RestControllerAdvice
@Slf4j
public class ApiExceptionAdvice {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiExceptionResponse> handleException(ApiException e) {
        log.error(LOG_HANDLE_EXCEPTION_TEMPLATE, e.getMessage(), e);
        ApiExceptionResponse response = ApiExceptionResponse.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .error(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .message(e.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
