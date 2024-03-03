package com.example.demo.errorHandling;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(notFoundException.class)
    public String error(notFoundException ex) {
        return "paginaError";
    }
}


