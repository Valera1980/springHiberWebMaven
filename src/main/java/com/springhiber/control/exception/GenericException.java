/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springhiber.control.exception;

/**
 *
 * @author valera
 */
public class GenericException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String exceptionMsg;
    private String exceptionCode;
    
    public GenericException(String exceptionCode, String exceptionMsg) {
          this.exceptionCode = exceptionCode;
          this.exceptionMsg = exceptionMsg;
   }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    
}
