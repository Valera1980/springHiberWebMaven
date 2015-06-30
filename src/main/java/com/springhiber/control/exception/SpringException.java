/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springhiber.control.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author valera
 */
@ControllerAdvice
public class SpringException {

    @ExceptionHandler(Exception.class)
    public ModelAndView allException(Exception e) {
        ModelAndView modelAndView = new ModelAndView("error/exception");

        modelAndView.addObject("error", e.getClass().getSimpleName());
        modelAndView.addObject("message", e.getMessage());

        return modelAndView;
    }

//    @ExceptionHandler(GenericException.class)
//    public ModelAndView genericException(GenericException ex) {
//        ModelAndView modelAndView = new ModelAndView("error/exception");
//        
//        modelAndView.addObject("error", ex.getClass().getSimpleName());
//        modelAndView.addObject("message",
//                ex.getExceptionCode() + " - " + ex.getExceptionMsg());
//
//        return modelAndView;
//    }
}
