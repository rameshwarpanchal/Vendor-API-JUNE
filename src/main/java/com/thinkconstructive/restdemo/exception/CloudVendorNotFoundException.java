package com.thinkconstructive.restdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CloudVendorNotFoundException extends RuntimeException{
    public CloudVendorNotFoundException(String message) {
        super(message);
    }
}
