package com.mkhldvdv.bdr.backend.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiExceptionResponse {

    private Integer statusCode;
    private String error;
    private String message;

}
