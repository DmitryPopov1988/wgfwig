package com.code.gazer.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView catchException(final Exception exception) {
        final ModelAndView modelAndView = new ModelAndView ("error.html");
        modelAndView.addObject ("error", exception.getMessage ( ));
        return modelAndView;
    }

}
