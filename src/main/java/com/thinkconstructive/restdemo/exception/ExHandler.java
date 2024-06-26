package com.thinkconstructive.restdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExHandler {
    @ExceptionHandler(CloudVendorNotFoundException.class)
    public ResponseEntity<Object> notFoundHandler(CloudVendorNotFoundException exception){
        Cloud_ExceptionInfoObject data = new Cloud_ExceptionInfoObject(exception.getMessage(),exception.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(data,HttpStatus.NOT_FOUND);
    }
}