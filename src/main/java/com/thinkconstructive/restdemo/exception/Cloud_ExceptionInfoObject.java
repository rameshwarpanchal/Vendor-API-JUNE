package com.thinkconstructive.restdemo.exception;

import org.springframework.http.HttpStatus;

public class Cloud_ExceptionInfoObject {
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;

    public Cloud_ExceptionInfoObject(String message, Throwable cause, HttpStatus httpStatus) {
        this.message = message;
        this.cause = cause;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return cause;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
