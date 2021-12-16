package com.mkhldvdv.bdr.backend.exception;

import java.util.List;

public class ApiException extends RuntimeException {

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String messageTemplate, List<String> args) {
        String message = String.format(messageTemplate, args.toArray());
        throw new ApiException(message);
    }

    public ApiException(String messageTemplate, List<String> args, Throwable cause) {
        String message = String.format(messageTemplate, args.toArray());
        throw new ApiException(message, cause);
    }

    public ApiException(String messageTemplate, String... args) {
        String message = String.format(messageTemplate, (Object[]) args);
        throw new ApiException(message);
    }

    public ApiException(String messageTemplate, Throwable cause, String... args) {
        String message = String.format(messageTemplate, (Object[]) args);
        throw new ApiException(message, cause);
    }

}
