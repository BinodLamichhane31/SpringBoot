package com.example.demo.Exception;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice


public class CustomExceptionHandler {
    @ExceptionHandler({Exception.class})
    public String handleAll(Exception ex, final WebRequest request){
        return ex.getMessage();
    }

}
