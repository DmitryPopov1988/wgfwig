package com.code.gazer.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

  @ExceptionHandler(Exception.class)
  public ModelAndView catchException(final Exception exc) {
    final ModelAndView modelAndView = new ModelAndView("error");
    modelAndView.addObject("error", exc.getMessage());
    return modelAndView;
  }

}
