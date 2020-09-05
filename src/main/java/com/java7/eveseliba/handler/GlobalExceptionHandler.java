package com.java7.eveseliba.handler;

import com.java7.eveseliba.dto.Response;
import com.java7.eveseliba.mapper.ResponseMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice
public class GlobalExceptionHandler {

    private final ResponseMapper responseMapper;
    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    public GlobalExceptionHandler(ResponseMapper responseMapper) {
        this.responseMapper = responseMapper;
    }

    @ExceptionHandler(Exception.class)
    public Response globalExceptionHandler(Exception ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        return responseMapper.mapFail(ex.getMessage(), "ERROR");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response globalExceptionHandler(MethodArgumentNotValidException ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        return responseMapper.mapFail("Provided is not correct", "ERROR");
    }



}
