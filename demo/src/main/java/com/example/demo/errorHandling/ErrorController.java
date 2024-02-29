package com.example.demo.errorHandling;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(notFoundException.class)
    public String error(Model model, notFoundException ex) {

        model.addAttribute("id", ex.getId());
        return ("paginaError");
    }
}
